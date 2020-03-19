package com.soundai.nettyTrans;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: liujialei
 * @create: 2019-11-13 20:51
 **/
public class PlainNioServer {

    ByteBuffer msg = ByteBuffer.wrap("Hi\r\n".getBytes());

    public void serve (int port) throws IOException {
        //A selectable channel for stream-oriented listening sockets
        ServerSocketChannel serverChannel = ServerSocketChannel.open();
        serverChannel.configureBlocking(false);
        ServerSocket socket = serverChannel.socket();
        socket.bind(new InetSocketAddress(port));
        Selector selector = Selector.open();
        serverChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            selector.select();
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            handlerKeys(selector, selectionKeys);
        }
    }

    private void handlerKeys(Selector selector, Set<SelectionKey> selectionKeys) throws IOException {
        Iterator<SelectionKey> keyIterator = selectionKeys.iterator();
        while (keyIterator.hasNext()) {
            SelectionKey key = keyIterator.next();
            keyIterator.remove();
            if (key.isAcceptable()) {
                handlerAcceptKey(selector ,key);
            }
            if (key.isWritable()) {
                handlerWriteKey(key);
            }
        }
    }

    private void handlerWriteKey(SelectionKey key) throws IOException {
        SocketChannel socketChannel = (SocketChannel) key.channel();
        ByteBuffer byffer = (ByteBuffer) key.attachment();
        while (byffer.hasRemaining()) {
            if (socketChannel.write(byffer) == 0) {
                break;
            }
        }
        socketChannel.close();
    }

    private void handlerAcceptKey(Selector selector, SelectionKey selectionKey) throws IOException {
        ServerSocketChannel serverSocketChannel = (ServerSocketChannel) selectionKey.channel();
        SocketChannel socketChannel = serverSocketChannel.accept();
        socketChannel.configureBlocking(false);
        socketChannel.register(selector, SelectionKey.OP_WRITE | SelectionKey.OP_READ, msg.duplicate());
        System.out.println("从" + socketChannel + "接收消息");
    }

}

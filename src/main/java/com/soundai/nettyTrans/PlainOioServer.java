package com.soundai.nettyTrans;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: liujialei
 * @create: 2019-11-13 20:26
 **/
public class PlainOioServer {

    public void serve (int port) throws IOException {
        final ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("有一个新的socket连接！");
            handlerThisSocket(socket);
        }

    }

    private void handlerThisSocket(Socket socket) {
        new Thread(() -> {
            System.out.println("开始处理新的连接");
            System.out.println();
            try {
                OutputStream out = socket.getOutputStream();
                out.write("Hi!\r\n".getBytes());
                out.flush();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {

                }
            }
        }).start();
    }

}

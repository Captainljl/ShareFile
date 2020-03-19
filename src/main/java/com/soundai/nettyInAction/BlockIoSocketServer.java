package com.soundai.nettyInAction;

import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1.1 阻塞socket服务
 *
 * @author: liujialei
 * @create: 2020-01-04 16:23
 **/
public class BlockIoSocketServer {

    public static void main(String[] args) throws Exception {
        int port = 8080;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        BufferedReader bufferedReader1 = new BufferedReader(new BufferedReader(new InputStreamReader(socket.getInputStream())));

        //64KB * 1024 = 64Mb
    }

}

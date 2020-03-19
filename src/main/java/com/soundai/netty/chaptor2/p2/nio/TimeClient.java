package com.soundai.netty.chaptor2.p2.nio;

public class TimeClient {
    public static void main(String[] args) {
        int port = 8080;
        new Thread(new TimeClientHandler("localhost", port)).start();
    }
}

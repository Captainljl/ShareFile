package com.soundai.netty.chaptor2.p2.nio;

public class TimeServer {
    public static void main(String[] args) {
        int port = 8080;
        MultipleTimeServer timeServer = new MultipleTimeServer(port);
        new Thread(timeServer, "NIO-001").start();
    }
}

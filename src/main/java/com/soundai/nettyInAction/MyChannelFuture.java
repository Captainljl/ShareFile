package com.soundai.nettyInAction;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;

import java.nio.channels.Channel;

/**
 * @author: liujialei
 * @create: 2020-01-15 17:15
 **/
public class MyChannelFuture {

    public void test () {
        Channel channel = null;
        ChannelFuture future = null;
        future.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture future) throws Exception {
                if (future.isSuccess()) {
                    future.channel().write("");
                }
            }
        });
    }


}

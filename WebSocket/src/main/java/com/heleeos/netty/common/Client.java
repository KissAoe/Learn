package com.heleeos.netty.common;

import io.netty.channel.ChannelHandlerContext;

/**
 * 表示一次连接的对象
 * Created by liyu on 01/03/2018.
 */
public class Client {

    private String id;

    private String name;

    private ChannelHandlerContext context;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChannelHandlerContext getContext() {
        return context;
    }

    public void setContext(ChannelHandlerContext context) {
        this.context = context;
    }
}

package com.heleeos.netty.common;

import com.google.gson.Gson;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;

import java.util.HashMap;
import java.util.Map;

/**
 * 服务端返回的结果
 * Created by liyu on 01/03/2018.
 */
public class Response {

    /** 服务ID */
    private String serviceID;

    /** 返回结果码 */
    private Code code;

    /** 返回信息 */
    private String message;

    /** 返回数据 */
    private Map<String, String> data = new HashMap<>();

    public Response() {}

    public Response(Code code) {
        this.code = code;
        this.message = code.info;
    }

    public Response(Code code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void putData(String key, String value) {
        data.put(key, value);
    }

    public TextWebSocketFrame getTextWebSocketFrame() {
        return new TextWebSocketFrame(new Gson().toJson(this));
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

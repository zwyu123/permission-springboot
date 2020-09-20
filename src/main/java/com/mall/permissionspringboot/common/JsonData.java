package com.mall.permissionspringboot.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonData<T> {

    private boolean ret;

    private String msg;

    private T data;

    public JsonData(boolean ret, String msg, T data) {
        this.ret = ret;
        this.msg = msg;
        this.data = data;
    }

    public JsonData(boolean ret, T data) {
        this.ret = ret;
        this.data = data;
    }

    public JsonData(boolean ret, String msg) {
        this.ret = ret;
        this.msg = msg;
    }

    public JsonData(boolean ret) {
        this.ret = ret;
    }

    public static <T> JsonData<T> success(String msg, T data) {
        return new JsonData<T>(true, msg, data);
    }

    public static <T> JsonData<T> success(T data) {
        return new JsonData<T>(true, data);
    }

    public static JsonData success() {
        return new JsonData(true);
    }

    public static JsonData fail(String msg) {
        return new JsonData(false, msg);
    }
}

package com.example.demo.common;

import lombok.Data;

@Data
public class R<T> {
    private Integer code;
    private String message;
    private T data;

    private R() {
    }

    public static <T> R ok(T data) {
        R r = new R();
        r.setCode(200);
        r.setMessage("成功");
        r.data = data;
        return r;
    }

    public static R error() {
        R r = new R();
        r.setCode(400);
        r.setMessage("失败");
        return r;
    }


    public R code(int code) {

//        this.setCode(code);
        this.code = code;
        return this;
    }

    public R message(String message) {
        this.message = message;
        return this;
    }

    public R data(T data) {
        this.data = data;
        return this;
    }

}

package com.gorilla.rm.domain;

/**
 * 通用返回包装类
 */
public class ResultEntity {

    private Integer code = null;

    private Object result = null;

    private String message = null;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getResult() {
        return result;
    }

    public ResultEntity setResult(Object result) {
        this.result = result;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResultEntity setMessage(String message) {
        this.message = message;
        return this;
    }
}

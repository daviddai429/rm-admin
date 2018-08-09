package com.gorilla.rm.rmcommon.util;

import com.gorilla.rm.rmcommon.domain.ResultEntity;

public class ResultEntityUtil {

    public static ResultEntity success(Object data,String message){
        ResultEntity entity = new ResultEntity();
        entity.setCode(200);
        entity.setMessage(message);
        entity.setResult(data);
        return entity;
    }

    public static ResultEntity fail(Object data,String message){
        ResultEntity entity = new ResultEntity();
        entity.setCode(400);
        entity.setMessage(message);
        entity.setResult(data);
        return entity;
    }

    public static ResultEntity error(Object data,String message){
        ResultEntity entity = new ResultEntity();
        entity.setCode(500);
        entity.setMessage(message);
        entity.setResult(data);
        return entity;
    }
}

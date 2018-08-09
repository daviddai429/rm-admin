package com.gorilla.rm.rmweb.springframe.exception;

/**
 * 业务异常类
 * RuntimeException为非检查异常，为程序运行时出现的异常
 */
public class BusinessException extends RuntimeException{

    public BusinessException(String message){
        super(message);
    }

}

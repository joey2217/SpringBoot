package com.joey.admin.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author EDZ
 */
//@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Object handleException(Exception e){
        return e;
    }
}

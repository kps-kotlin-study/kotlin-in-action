package com.project.agit.common.exception;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\t\u001a\u00020\nH\u0017\u00a8\u0006\u000b"}, d2 = {"Lcom/project/agit/common/exception/ExceptionHandler;", "Lorg/springframework/web/servlet/mvc/method/annotation/ResponseEntityExceptionHandler;", "()V", "handleClientException", "Lorg/springframework/http/ResponseEntity;", "", "ex", "Ljava/lang/Exception;", "Lkotlin/Exception;", "request", "Ljavax/servlet/http/HttpServletRequest;", "agit-common"})
@org.springframework.web.bind.annotation.RestControllerAdvice
public class ExceptionHandler extends org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler {
    
    public ExceptionHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler
    public org.springframework.http.ResponseEntity<java.lang.Object> handleClientException(@org.jetbrains.annotations.NotNull
    java.lang.Exception ex, @org.jetbrains.annotations.NotNull
    javax.servlet.http.HttpServletRequest request) {
        return null;
    }
}
package com.project.agit.common.cafe;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/project/agit/common/cafe/EmployeeNotFoundException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "statusCode", "Lorg/springframework/http/HttpStatus;", "reason", "", "(Lorg/springframework/http/HttpStatus;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "getStatusCode", "()Lorg/springframework/http/HttpStatus;", "agit-common"})
public final class EmployeeNotFoundException extends java.lang.Exception {
    @org.jetbrains.annotations.NotNull
    private final org.springframework.http.HttpStatus statusCode = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String reason = null;
    
    public EmployeeNotFoundException(@org.jetbrains.annotations.NotNull
    org.springframework.http.HttpStatus statusCode, @org.jetbrains.annotations.NotNull
    java.lang.String reason) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.springframework.http.HttpStatus getStatusCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getReason() {
        return null;
    }
}
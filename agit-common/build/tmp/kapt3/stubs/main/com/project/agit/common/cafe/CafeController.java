package com.project.agit.common.cafe;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0017J\b\u0010\u0005\u001a\u00020\u0006H\u0017\u00a8\u0006\u0007"}, d2 = {"Lcom/project/agit/common/cafe/CafeController;", "", "()V", "order", "Lorg/springframework/http/ResponseEntity;", "showMenu", "", "agit-common"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/v1/cafe"})
@org.springframework.web.bind.annotation.RestController
public class CafeController {
    
    public CafeController() {
        super();
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/menu"})
    public int showMenu() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {"/order"})
    public org.springframework.http.ResponseEntity<java.lang.Object> order() {
        return null;
    }
}
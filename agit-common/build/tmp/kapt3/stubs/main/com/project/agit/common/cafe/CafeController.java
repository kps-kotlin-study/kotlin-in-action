package com.project.agit.common.cafe;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0017J\u0012\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/project/agit/common/cafe/CafeController;", "", "cafeService", "Lcom/project/agit/common/cafe/CafeService;", "cafeMenu", "", "Lcom/project/agit/common/cafe/dto/CafeMenu;", "(Lcom/project/agit/common/cafe/CafeService;Ljava/util/List;)V", "getMenuAll", "getMenuOne", "menuId", "", "order", "Lcom/project/agit/common/cafe/OrderResponse;", "orderMenu", "Lcom/project/agit/common/cafe/OrderMenu;", "agit-common"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/v1/cafe"})
@org.springframework.web.bind.annotation.RestController
public class CafeController {
    private final com.project.agit.common.cafe.CafeService cafeService = null;
    private java.util.List<com.project.agit.common.cafe.dto.CafeMenu> cafeMenu;
    
    public CafeController() {
        super();
    }
    
    public CafeController(@org.jetbrains.annotations.NotNull
    com.project.agit.common.cafe.CafeService cafeService, @org.jetbrains.annotations.NotNull
    java.util.List<com.project.agit.common.cafe.dto.CafeMenu> cafeMenu) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/menu"})
    public java.util.List<com.project.agit.common.cafe.dto.CafeMenu> getMenuAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/menu/{menuId}"})
    public com.project.agit.common.cafe.dto.CafeMenu getMenuOne(@org.springframework.web.bind.annotation.PathVariable(value = "menuId")
    int menuId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {"/order/{menuId}"})
    public com.project.agit.common.cafe.OrderResponse order(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.project.agit.common.cafe.OrderMenu orderMenu) {
        return null;
    }
}
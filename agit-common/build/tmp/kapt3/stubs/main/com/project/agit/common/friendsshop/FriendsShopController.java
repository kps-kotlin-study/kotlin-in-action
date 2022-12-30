package com.project.agit.common.friendsshop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0017J\b\u0010\u000f\u001a\u00020\nH\u0017J\b\u0010\u0010\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/project/agit/common/friendsshop/FriendsShopController;", "", "friendsShopService", "Lcom/project/agit/common/friendsshop/FriendsShopService;", "(Lcom/project/agit/common/friendsshop/FriendsShopService;)V", "buyProduct", "", "request", "Lcom/project/agit/common/friendsshop/dto/FriendsShopReqeust;", "buyProduct_test", "", "productType", "Lcom/project/agit/common/friendsshop/dto/ProductType;", "getOrderBook", "", "getProductList", "ping2", "agit-common"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/friendsshop"})
@org.springframework.web.bind.annotation.RestController
public class FriendsShopController {
    private final com.project.agit.common.friendsshop.FriendsShopService friendsShopService = null;
    
    public FriendsShopController(@org.jetbrains.annotations.NotNull
    com.project.agit.common.friendsshop.FriendsShopService friendsShopService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping
    public java.lang.String ping2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/buy_test"})
    public java.lang.String buyProduct_test(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestParam(name = "product", required = true)
    com.project.agit.common.friendsshop.dto.ProductType productType) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/buy"})
    public void buyProduct(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.project.agit.common.friendsshop.dto.FriendsShopReqeust request) {
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/all"})
    public java.util.List<java.lang.String> getOrderBook() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/productList"})
    public java.lang.String getProductList() {
        return null;
    }
}
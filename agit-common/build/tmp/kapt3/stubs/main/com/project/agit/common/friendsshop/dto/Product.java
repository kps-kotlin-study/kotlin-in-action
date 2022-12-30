package com.project.agit.common.friendsshop.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/project/agit/common/friendsshop/dto/Product;", "Lcom/project/agit/common/friendsshop/dto/FriendsShopProduct;", "productName", "", "price", "", "(Ljava/lang/String;I)V", "counts", "getCounts", "()I", "setCounts", "(I)V", "getPrice", "getProductName", "()Ljava/lang/String;", "productType", "Lcom/project/agit/common/friendsshop/dto/ProductType;", "getProductType", "()Lcom/project/agit/common/friendsshop/dto/ProductType;", "agit-common"})
public final class Product implements com.project.agit.common.friendsshop.dto.FriendsShopProduct {
    @org.jetbrains.annotations.NotNull
    private final com.project.agit.common.friendsshop.dto.ProductType productType = com.project.agit.common.friendsshop.dto.ProductType.UNKNOWN;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String productName = null;
    private final int price = 0;
    private int counts;
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.project.agit.common.friendsshop.dto.ProductType getProductType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getProductName() {
        return null;
    }
    
    @java.lang.Override
    public int getPrice() {
        return 0;
    }
    
    @java.lang.Override
    public int getCounts() {
        return 0;
    }
    
    @java.lang.Override
    public void setCounts(int p0) {
    }
    
    public Product(@org.jetbrains.annotations.NotNull
    java.lang.String productName, int price) {
        super();
    }
}
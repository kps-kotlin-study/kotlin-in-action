package com.project.agit.common.friendsshop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/project/agit/common/friendsshop/Doll;", "Lcom/project/agit/common/friendsshop/FriendsShopProduct;", "productName", "", "price", "", "(Ljava/lang/String;I)V", "getPrice", "()I", "getProductName", "()Ljava/lang/String;", "productType", "Lcom/project/agit/common/friendsshop/ProductType;", "getProductType", "()Lcom/project/agit/common/friendsshop/ProductType;", "agit-common"})
public final class Doll implements com.project.agit.common.friendsshop.FriendsShopProduct {
    @org.jetbrains.annotations.NotNull
    private final com.project.agit.common.friendsshop.ProductType productType = com.project.agit.common.friendsshop.ProductType.DOLL;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String productName = null;
    private final int price = 0;
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.project.agit.common.friendsshop.ProductType getProductType() {
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
    
    public Doll(@org.jetbrains.annotations.NotNull
    java.lang.String productName, int price) {
        super();
    }
}
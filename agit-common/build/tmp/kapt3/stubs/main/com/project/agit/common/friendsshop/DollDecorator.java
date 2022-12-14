package com.project.agit.common.friendsshop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u0006X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/project/agit/common/friendsshop/DollDecorator;", "Lcom/project/agit/common/friendsshop/FriendsShopProduct;", "doll", "Lcom/project/agit/common/friendsshop/Doll;", "(Lcom/project/agit/common/friendsshop/Doll;)V", "price", "", "getPrice", "()I", "productName", "", "getProductName", "()Ljava/lang/String;", "productType", "Lcom/project/agit/common/friendsshop/ProductType;", "getProductType", "()Lcom/project/agit/common/friendsshop/ProductType;", "agit-common"})
public abstract class DollDecorator implements com.project.agit.common.friendsshop.FriendsShopProduct {
    private final com.project.agit.common.friendsshop.Doll doll = null;
    
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
    
    public DollDecorator(@org.jetbrains.annotations.NotNull
    com.project.agit.common.friendsshop.Doll doll) {
        super();
    }
}
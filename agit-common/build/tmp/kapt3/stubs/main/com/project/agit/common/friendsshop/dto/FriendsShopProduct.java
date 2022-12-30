package com.project.agit.common.friendsshop.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/project/agit/common/friendsshop/dto/FriendsShopProduct;", "", "counts", "", "getCounts", "()I", "setCounts", "(I)V", "price", "getPrice", "productName", "", "getProductName", "()Ljava/lang/String;", "productType", "Lcom/project/agit/common/friendsshop/dto/ProductType;", "getProductType", "()Lcom/project/agit/common/friendsshop/dto/ProductType;", "agit-common"})
public abstract interface FriendsShopProduct {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.project.agit.common.friendsshop.dto.ProductType getProductType();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getProductName();
    
    public abstract int getPrice();
    
    public abstract int getCounts();
    
    public abstract void setCounts(int p0);
}
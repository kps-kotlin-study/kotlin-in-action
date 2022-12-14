package com.project.agit.common.company;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001f\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000eH\u0010\u00a2\u0006\u0002\b\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/project/agit/common/company/CompanyService;", "", "companyProperty", "Lcom/project/agit/common/property/CompanyProperty;", "(Lcom/project/agit/common/property/CompanyProperty;)V", "getCompany", "Lcom/project/agit/common/company/dto/Company;", "companyId", "", "getCompanyAll", "", "Lcom/project/agit/common/company/dto/CompanyResponse;", "getCompanyInfo", "companyName", "", "registerCompany", "request", "Lcom/project/agit/common/company/dto/CompanyRequest;", "throwIfExistCompanyName", "", "name", "message", "throwIfExistCompanyName$agit_common", "agit-common"})
@org.springframework.stereotype.Service
public class CompanyService {
    private final com.project.agit.common.property.CompanyProperty companyProperty = null;
    
    public CompanyService(@org.jetbrains.annotations.NotNull
    com.project.agit.common.property.CompanyProperty companyProperty) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.project.agit.common.company.dto.Company getCompany(long companyId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.project.agit.common.company.dto.Company registerCompany(@org.jetbrains.annotations.NotNull
    com.project.agit.common.company.dto.CompanyRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public com.project.agit.common.company.dto.Company getCompanyInfo(@org.jetbrains.annotations.NotNull
    java.lang.String companyName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.project.agit.common.company.dto.CompanyResponse> getCompanyAll() {
        return null;
    }
    
    public void throwIfExistCompanyName$agit_common(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
}
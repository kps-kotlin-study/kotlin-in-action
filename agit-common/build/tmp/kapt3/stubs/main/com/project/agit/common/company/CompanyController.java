package com.project.agit.common.company;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0017J\u0012\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\rH\u0017J\u0012\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/project/agit/common/company/CompanyController;", "", "companyService", "Lcom/project/agit/common/company/CompanyService;", "(Lcom/project/agit/common/company/CompanyService;)V", "getCompany", "Lcom/project/agit/common/company/dto/CompanyResponse;", "companyId", "", "getCompanyAll", "", "getCompanyInfo", "companyName", "", "registerCompany", "request", "Lcom/project/agit/common/company/dto/CompanyRequest;", "agit-common"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/v1/company"})
@org.springframework.web.bind.annotation.RestController
public class CompanyController {
    private final com.project.agit.common.company.CompanyService companyService = null;
    
    public CompanyController(@org.jetbrains.annotations.NotNull
    com.project.agit.common.company.CompanyService companyService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{company_id}"})
    public com.project.agit.common.company.dto.CompanyResponse getCompany(@org.springframework.web.bind.annotation.PathVariable(value = "company_id")
    long companyId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {""})
    public com.project.agit.common.company.dto.CompanyResponse registerCompany(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.project.agit.common.company.dto.CompanyRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/info"})
    public com.project.agit.common.company.dto.CompanyResponse getCompanyInfo(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestParam(value = "company_name")
    java.lang.String companyName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/all"})
    public java.util.List<com.project.agit.common.company.dto.CompanyResponse> getCompanyAll() {
        return null;
    }
}
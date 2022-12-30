package com.project.agit.common.company;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0017J\u001c\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H\u0017J\u0012\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\u0012\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/project/agit/common/company/CompanyCommuteController;", "", "companyCommuteService", "Lcom/project/agit/common/company/CompanyCommuteService;", "(Lcom/project/agit/common/company/CompanyCommuteService;)V", "getCommuteCompany", "", "", "companyName", "personName", "getCommuteCompanyPerson", "", "getOffWorkCompany", "request", "Lcom/project/agit/common/company/dto/CompanyCommuteRequest;", "goToWorkCompany", "agit-common"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/v1/company/commute"})
@org.springframework.web.bind.annotation.RestController
public class CompanyCommuteController {
    private final com.project.agit.common.company.CompanyCommuteService companyCommuteService = null;
    
    public CompanyCommuteController(@org.jetbrains.annotations.NotNull
    com.project.agit.common.company.CompanyCommuteService companyCommuteService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {"/in"})
    public java.lang.String goToWorkCompany(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.project.agit.common.company.dto.CompanyCommuteRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {"/out"})
    public java.lang.String getOffWorkCompany(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.project.agit.common.company.dto.CompanyCommuteRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/info"})
    public java.util.Set<java.lang.String> getCommuteCompany(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestParam(value = "company_name")
    java.lang.String companyName, @org.jetbrains.annotations.Nullable
    @org.springframework.web.bind.annotation.RequestParam(value = "person_name")
    java.lang.String personName) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.GetMapping(value = {"/person"})
    public void getCommuteCompanyPerson(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestParam(value = "company_name")
    java.lang.String companyName, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestParam(value = "person_name")
    java.lang.String personName) {
    }
}
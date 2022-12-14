package com.project.agit.common.company;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017J\u0012\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\tH\u0017J\u0012\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/project/agit/common/company/CompanyPersonController;", "", "companyPersonService", "Lcom/project/agit/common/company/CompanyPersonService;", "(Lcom/project/agit/common/company/CompanyPersonService;)V", "getCompanyJoinPersons", "", "Lcom/project/agit/common/company/dto/CompanyPersonResponse;", "companyName", "", "getPersonCompany", "personName", "join", "request", "Lcom/project/agit/common/company/dto/CompanyJoinRequest;", "agit-common"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/v1/company/join"})
@org.springframework.web.bind.annotation.RestController
public class CompanyPersonController {
    private final com.project.agit.common.company.CompanyPersonService companyPersonService = null;
    
    public CompanyPersonController(@org.jetbrains.annotations.NotNull
    com.project.agit.common.company.CompanyPersonService companyPersonService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {""})
    public java.lang.String join(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.project.agit.common.company.dto.CompanyJoinRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {""})
    public java.util.List<com.project.agit.common.company.dto.CompanyPersonResponse> getCompanyJoinPersons(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestParam(value = "company_name")
    java.lang.String companyName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/person"})
    public com.project.agit.common.company.dto.CompanyPersonResponse getPersonCompany(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestParam(value = "person_name")
    java.lang.String personName) {
        return null;
    }
}
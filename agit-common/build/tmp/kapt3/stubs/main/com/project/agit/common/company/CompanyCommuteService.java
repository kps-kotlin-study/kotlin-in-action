package com.project.agit.common.company;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/project/agit/common/company/CompanyCommuteService;", "", "companyPersonService", "Lcom/project/agit/common/company/CompanyPersonService;", "companyService", "Lcom/project/agit/common/company/CompanyService;", "personService", "Lcom/project/agit/common/person/PersonService;", "(Lcom/project/agit/common/company/CompanyPersonService;Lcom/project/agit/common/company/CompanyService;Lcom/project/agit/common/person/PersonService;)V", "getCommuteCompany", "", "", "companyName", "personName", "getCommutePerson", "getOffWorkCompany", "", "request", "Lcom/project/agit/common/company/dto/CompanyCommuteRequest;", "goToWorkCompany", "Companion", "agit-common"})
@org.springframework.stereotype.Service
public class CompanyCommuteService {
    private final com.project.agit.common.company.CompanyPersonService companyPersonService = null;
    private final com.project.agit.common.company.CompanyService companyService = null;
    private final com.project.agit.common.person.PersonService personService = null;
    @org.jetbrains.annotations.NotNull
    public static final com.project.agit.common.company.CompanyCommuteService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> companyCommuteMap = null;
    
    public CompanyCommuteService(@org.jetbrains.annotations.NotNull
    com.project.agit.common.company.CompanyPersonService companyPersonService, @org.jetbrains.annotations.NotNull
    com.project.agit.common.company.CompanyService companyService, @org.jetbrains.annotations.NotNull
    com.project.agit.common.person.PersonService personService) {
        super();
    }
    
    public void goToWorkCompany(@org.jetbrains.annotations.NotNull
    com.project.agit.common.company.dto.CompanyCommuteRequest request) {
    }
    
    public void getOffWorkCompany(@org.jetbrains.annotations.NotNull
    com.project.agit.common.company.dto.CompanyCommuteRequest request) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.Set<java.lang.String> getCommuteCompany(@org.jetbrains.annotations.NotNull
    java.lang.String companyName, @org.jetbrains.annotations.Nullable
    java.lang.String personName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getCommutePerson(@org.jetbrains.annotations.NotNull
    java.lang.String companyName, @org.jetbrains.annotations.NotNull
    java.lang.String personName) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R#\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/project/agit/common/company/CompanyCommuteService$Companion;", "", "()V", "companyCommuteMap", "", "", "", "getCompanyCommuteMap", "()Ljava/util/Map;", "agit-common"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> getCompanyCommuteMap() {
            return null;
        }
    }
}
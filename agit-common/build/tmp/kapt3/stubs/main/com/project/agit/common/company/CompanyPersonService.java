package com.project.agit.common.company;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0012J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0012J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0010\u001a\u00020\nH\u0012J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/project/agit/common/company/CompanyPersonService;", "", "companyService", "Lcom/project/agit/common/company/CompanyService;", "personService", "Lcom/project/agit/common/person/PersonService;", "(Lcom/project/agit/common/company/CompanyService;Lcom/project/agit/common/person/PersonService;)V", "companyValidationCheck", "", "companyName", "", "getCompanyJoinPersons", "", "Lcom/project/agit/common/company/dto/CompanyPersonResponse;", "getPersonCompany", "Lcom/project/agit/common/company/dto/CompanyPerson;", "personName", "join", "request", "Lcom/project/agit/common/company/dto/CompanyJoinRequest;", "personJoinCompanyValidationCheck", "personInfo", "Lcom/project/agit/common/person/dto/Person;", "personValidationCheck", "validationCheck", "Companion", "agit-common"})
@org.springframework.stereotype.Service
public class CompanyPersonService {
    private final com.project.agit.common.company.CompanyService companyService = null;
    private final com.project.agit.common.person.PersonService personService = null;
    @org.jetbrains.annotations.NotNull
    public static final com.project.agit.common.company.CompanyPersonService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.List<com.project.agit.common.company.dto.CompanyPerson> companyPersonList = null;
    
    public CompanyPersonService(@org.jetbrains.annotations.NotNull
    com.project.agit.common.company.CompanyService companyService, @org.jetbrains.annotations.NotNull
    com.project.agit.common.person.PersonService personService) {
        super();
    }
    
    public void join(@org.jetbrains.annotations.NotNull
    com.project.agit.common.company.dto.CompanyJoinRequest request) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.project.agit.common.company.dto.CompanyPersonResponse> getCompanyJoinPersons(@org.jetbrains.annotations.NotNull
    java.lang.String companyName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.project.agit.common.company.dto.CompanyPerson getPersonCompany(@org.jetbrains.annotations.NotNull
    java.lang.String personName) {
        return null;
    }
    
    private void validationCheck(com.project.agit.common.company.dto.CompanyJoinRequest request) {
    }
    
    private void personJoinCompanyValidationCheck(com.project.agit.common.person.dto.Person personInfo) {
    }
    
    private void personValidationCheck(com.project.agit.common.person.dto.Person personInfo, java.lang.String personName) {
    }
    
    private void companyValidationCheck(java.lang.String companyName) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/project/agit/common/company/CompanyPersonService$Companion;", "", "()V", "companyPersonList", "", "Lcom/project/agit/common/company/dto/CompanyPerson;", "getCompanyPersonList", "()Ljava/util/List;", "agit-common"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.project.agit.common.company.dto.CompanyPerson> getCompanyPersonList() {
            return null;
        }
    }
}
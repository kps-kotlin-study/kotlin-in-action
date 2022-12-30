package com.project.agit.common.person;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/project/agit/common/person/PersonController;", "", "personService", "Lcom/project/agit/common/person/PersonService;", "(Lcom/project/agit/common/person/PersonService;)V", "getPersonInfo", "Lcom/project/agit/common/person/dto/PersonResponse;", "personName", "", "agit-common"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/v1/person"})
@org.springframework.web.bind.annotation.RestController
public class PersonController {
    private final com.project.agit.common.person.PersonService personService = null;
    
    public PersonController(@org.jetbrains.annotations.NotNull
    com.project.agit.common.person.PersonService personService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/info"})
    public com.project.agit.common.person.dto.PersonResponse getPersonInfo(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestParam(value = "person_name")
    java.lang.String personName) {
        return null;
    }
}
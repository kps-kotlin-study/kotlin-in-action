package com.project.agit.common.person;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/project/agit/common/person/PersonService;", "", "personProperty", "Lcom/project/agit/common/property/PersonProperty;", "(Lcom/project/agit/common/property/PersonProperty;)V", "changePersonInfo", "", "person", "Lcom/project/agit/common/person/dto/Person;", "request", "Lcom/project/agit/common/person/dto/PersonRequest;", "changePersonLocation", "", "personName", "", "location", "Lcom/project/agit/common/person/constant/Location;", "getNotNullPersonInfo", "getPersonInfo", "isFindPersonInLocation", "agit-common"})
@org.springframework.stereotype.Service
public class PersonService {
    private final com.project.agit.common.property.PersonProperty personProperty = null;
    
    public PersonService(@org.jetbrains.annotations.NotNull
    com.project.agit.common.property.PersonProperty personProperty) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public com.project.agit.common.person.dto.Person getPersonInfo(@org.jetbrains.annotations.NotNull
    java.lang.String personName) {
        return null;
    }
    
    public void changePersonInfo(@org.jetbrains.annotations.NotNull
    com.project.agit.common.person.dto.Person person, @org.jetbrains.annotations.NotNull
    com.project.agit.common.person.dto.PersonRequest request) {
    }
    
    public boolean changePersonLocation(@org.jetbrains.annotations.NotNull
    java.lang.String personName, @org.jetbrains.annotations.Nullable
    com.project.agit.common.person.constant.Location location) {
        return false;
    }
    
    public boolean isFindPersonInLocation(@org.jetbrains.annotations.NotNull
    java.lang.String personName, @org.jetbrains.annotations.NotNull
    com.project.agit.common.person.constant.Location location) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.project.agit.common.person.dto.Person getNotNullPersonInfo(@org.jetbrains.annotations.NotNull
    java.lang.String personName) {
        return null;
    }
}
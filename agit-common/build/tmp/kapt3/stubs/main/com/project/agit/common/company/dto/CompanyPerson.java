package com.project.agit.common.company.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\tH\u00c6\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\t\u0010\u001d\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/project/agit/common/company/dto/CompanyPerson;", "", "companyId", "", "person", "Lcom/project/agit/common/person/dto/Person;", "team", "", "isJoin", "", "(JLcom/project/agit/common/person/dto/Person;Ljava/lang/String;Z)V", "getCompanyId", "()J", "()Z", "getPerson", "()Lcom/project/agit/common/person/dto/Person;", "getTeam", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "to", "Lcom/project/agit/common/company/dto/CompanyPersonResponse;", "toString", "agit-common"})
public final class CompanyPerson {
    private final long companyId = 0L;
    @org.jetbrains.annotations.NotNull
    private final com.project.agit.common.person.dto.Person person = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String team = null;
    private final boolean isJoin = false;
    
    @org.jetbrains.annotations.NotNull
    public final com.project.agit.common.company.dto.CompanyPerson copy(long companyId, @org.jetbrains.annotations.NotNull
    com.project.agit.common.person.dto.Person person, @org.jetbrains.annotations.Nullable
    java.lang.String team, boolean isJoin) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public CompanyPerson(long companyId, @org.jetbrains.annotations.NotNull
    com.project.agit.common.person.dto.Person person, @org.jetbrains.annotations.Nullable
    java.lang.String team, boolean isJoin) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getCompanyId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.project.agit.common.person.dto.Person component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.project.agit.common.person.dto.Person getPerson() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTeam() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean isJoin() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.project.agit.common.company.dto.CompanyPersonResponse to() {
        return null;
    }
}
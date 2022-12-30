package com.project.agit.common.cafe;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/project/agit/common/cafe/EmployeeService;", "", "employeeRepository", "Lcom/project/agit/common/cafe/EmployeeRepository;", "(Lcom/project/agit/common/cafe/EmployeeRepository;)V", "createEmployee", "Lcom/project/agit/common/cafe/model/Employee;", "employee", "deleteEmployeesById", "", "employeeId", "", "getAllEmployees", "", "getEmployeesById", "updateEmployeeById", "agit-common"})
@org.springframework.stereotype.Service
public class EmployeeService {
    private final com.project.agit.common.cafe.EmployeeRepository employeeRepository = null;
    
    public EmployeeService(@org.jetbrains.annotations.NotNull
    com.project.agit.common.cafe.EmployeeRepository employeeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.project.agit.common.cafe.model.Employee> getAllEmployees() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.project.agit.common.cafe.model.Employee getEmployeesById(long employeeId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.project.agit.common.cafe.model.Employee createEmployee(@org.jetbrains.annotations.NotNull
    com.project.agit.common.cafe.model.Employee employee) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.project.agit.common.cafe.model.Employee updateEmployeeById(long employeeId, @org.jetbrains.annotations.NotNull
    com.project.agit.common.cafe.model.Employee employee) {
        return null;
    }
    
    public void deleteEmployeesById(long employeeId) {
    }
}
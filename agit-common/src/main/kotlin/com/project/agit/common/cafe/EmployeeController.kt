package com.project.agit.common.cafe

import com.project.agit.common.cafe.model.Employee
import com.project.agit.common.cafe.EmployeeService

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
@RestController
@RequestMapping("/v1/employee")
class EmployeeController(private val employeeService: EmployeeService) {

    @GetMapping("/")
    fun getAllEmployees(): List<Employee> = employeeService.getAllEmployees()

    @GetMapping("/{id}")
    fun getEmployeesById(@PathVariable("id") employeeId: Long): Employee =
        employeeService.getEmployeesById(employeeId)

    @PostMapping("/")
    fun createEmployee(@RequestBody payload: Employee): Employee = employeeService.createEmployee(payload)

    @PutMapping("/{id}")
    fun updateEmployeeById(@PathVariable("id") employeeId: Long, @RequestBody payload: Employee): Employee =
        employeeService.updateEmployeeById(employeeId, payload)

    @DeleteMapping("/{id}")
    fun deleteEmployeesById(@PathVariable("id") employeeId: Long): Unit =
        employeeService.deleteEmployeesById(employeeId)
}
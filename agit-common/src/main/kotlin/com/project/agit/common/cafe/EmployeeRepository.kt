package com.project.agit.common.cafe

import com.project.agit.common.cafe.model.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface EmployeeRepository : JpaRepository<Employee, Long>

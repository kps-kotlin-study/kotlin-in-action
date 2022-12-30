package com.project.agit.common.cafe

import org.springframework.http.HttpStatus

class EmployeeNotFoundException(val statusCode: HttpStatus, val reason: String) : Exception()
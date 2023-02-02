package com.project.agit.common.user

import org.springframework.http.HttpStatus

class UserNotFoundException(val statusCode: HttpStatus, val reason: String) : Exception()
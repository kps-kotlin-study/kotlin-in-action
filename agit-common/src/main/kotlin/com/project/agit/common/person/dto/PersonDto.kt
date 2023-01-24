package com.project.agit.common.person.dto

import com.project.agit.common.person.constant.Location

data class PersonDto(
    val name: String,
    val age: Int,
    val location: Location
)

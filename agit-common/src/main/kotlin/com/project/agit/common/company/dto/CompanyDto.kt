package com.project.agit.common.company.dto

import com.project.agit.common.dto.BaseInfo

data class CompanyDto(
    val id: Long,
    val name: String,
    val type: String
) : BaseInfo() {
    fun to(): CompanyPropertyResponse =
        CompanyPropertyResponse(
            id = id,
            name = name,
            type = type
        )
}

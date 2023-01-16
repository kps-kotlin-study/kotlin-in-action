package com.project.agit.common.company.dto

import com.project.agit.common.domain.company.Company

data class CompanyResponse(
    val id: Long?,
    val name: String?,
    val type: String?
) {
    companion object {
        fun from(company: Company?) =
            CompanyResponse(
                id = company?.id,
                name = company?.name,
                type = company?.type
            )
    }
}

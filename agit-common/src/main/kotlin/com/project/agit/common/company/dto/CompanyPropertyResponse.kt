package com.project.agit.common.company.dto

data class CompanyPropertyResponse(
    val id: Long?,
    val name: String?,
    val type: String?
) {
    companion object {
        fun from(companyDto: CompanyDto?) =
            CompanyPropertyResponse(
                id = companyDto?.id,
                name = companyDto?.name,
                type = companyDto?.type
            )
    }
}

package com.project.agit.common.domain.company

import com.project.agit.common.company.dto.CompanyCommuteResponse
import com.project.agit.common.domain.BaseEntity
import javax.persistence.Entity

@Entity
data class CompanyCommute(
    val companyName: String,
    val personName: String
) : BaseEntity() {
    fun to(): CompanyCommuteResponse =
        CompanyCommuteResponse(
            companyName = companyName,
            personName = personName
        )
}

package com.project.agit.common.domain.company

import com.project.agit.common.company.dto.CompanyPersonResponse
import com.project.agit.common.domain.BaseEntity
import javax.persistence.Entity

@Entity
data class CompanyPerson(
    val companyId: Long,
    val personId: Long,
    var team: String? = "",
    var isJoin: Boolean = false
) : BaseEntity() {
    fun to(): CompanyPersonResponse =
        CompanyPersonResponse(
            companyId = companyId,
            personId = personId,
            team = team,
            isJoin = isJoin
        )
}

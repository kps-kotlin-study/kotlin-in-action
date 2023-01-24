package com.project.agit.common.domain.company

import com.project.agit.common.company.dto.CompanyResponse
import com.project.agit.common.domain.BaseEntity
import javax.persistence.Entity

@Entity
data class Company(
    var name: String = "",
    var type: String = ""
) : BaseEntity() {
    fun to(): CompanyResponse =
        CompanyResponse(
            id = id,
            name = name,
            type = type
        )
}

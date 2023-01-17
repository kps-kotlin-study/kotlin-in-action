package com.project.agit.common.company.dto

import com.project.agit.common.domain.company.CompanyPerson

data class CompanyPersonResponse(
    val companyId: Long, // company 유니크 id
    val personId: Long, // 사람 정보
    val team: String?, // 팀
    val isJoin: Boolean = false // 입사 여부
) {
    companion object {
        fun from(companyPerson: CompanyPerson) =
            CompanyPersonResponse(
                companyId = companyPerson.companyId,
                personId = companyPerson.personId,
                team = companyPerson.team,
                isJoin = companyPerson.isJoin
            )
    }
}

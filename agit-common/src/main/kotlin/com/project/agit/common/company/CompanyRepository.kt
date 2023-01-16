package com.project.agit.common.company

import com.project.agit.common.domain.company.Company
import com.project.agit.common.domain.company.QCompany
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.data.jpa.repository.JpaRepository

interface CompanyRepository :
    JpaRepository<Company, Long>, CompanyRepositoryCustom

interface CompanyRepositoryCustom {
    fun findByNameOrNull(name: String?): Company?
}

class CompanyRepositoryCustomImpl(
    private val jpaQueryFactory: JPAQueryFactory
) : CompanyRepositoryCustom {

    override fun findByNameOrNull(name: String?): Company? {
        return jpaQueryFactory.selectFrom(QCompany.company)
            .where(QCompany.company.name.eq(name))
            .fetchOne()
    }
}

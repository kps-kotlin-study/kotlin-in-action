package com.project.agit.common.company

import com.project.agit.common.domain.company.CompanyPerson
import com.project.agit.common.domain.company.QCompanyPerson.companyPerson
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.data.jpa.repository.JpaRepository

interface CompanyPersonRepository :
    JpaRepository<CompanyPerson, Long>, CompanyPersonRepositoryCustom

interface CompanyPersonRepositoryCustom {
    fun findByCompanyId(companyId: Long): List<CompanyPerson>
    fun findByPersonId(personId: Long): CompanyPerson?
}

class CompanyPersonRepositoryCustomImpl(
    private val jpaQueryFactory: JPAQueryFactory
) : CompanyPersonRepositoryCustom {

    override fun findByCompanyId(companyId: Long): List<CompanyPerson> {
        return jpaQueryFactory.selectFrom(companyPerson)
            .where(companyPerson.companyId.eq(companyId))
            .fetch()
    }

    override fun findByPersonId(personId: Long): CompanyPerson? {
        return jpaQueryFactory.selectFrom(companyPerson)
            .where(companyPerson.personId.eq(personId))
            .fetchOne()
    }
}

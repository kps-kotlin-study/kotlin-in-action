package com.project.agit.common.company

import com.project.agit.common.domain.company.CompanyCommute
import com.project.agit.common.domain.company.QCompanyCommute.companyCommute
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.data.jpa.repository.JpaRepository

interface CompanyCommuteRepository :
    JpaRepository<CompanyCommute, Long>, CompanyCommuteRepositoryCustom {
    fun findByPersonName(personName: String): CompanyCommute?
}

interface CompanyCommuteRepositoryCustom {
    fun findByCompanyNameAndCommutePerson(companyName: String, personName: String): CompanyCommute?
    fun findAllByCompanyName(companyName: String): List<CompanyCommute>
}

class CompanyCommuteRepositoryCustomImpl(
    private val jpaQueryFactory: JPAQueryFactory
) : CompanyCommuteRepositoryCustom {
    override fun findByCompanyNameAndCommutePerson(companyName: String, personName: String): CompanyCommute? {
        return jpaQueryFactory.selectFrom(companyCommute)
            .where(
                companyCommute.companyName.eq(companyName),
                companyCommute.personName.eq(personName)
            ).fetchOne()
    }

    override fun findAllByCompanyName(companyName: String): List<CompanyCommute> {
        return jpaQueryFactory.selectFrom(companyCommute)
            .where(companyCommute.companyName.eq(companyName)).fetch()
    }
}

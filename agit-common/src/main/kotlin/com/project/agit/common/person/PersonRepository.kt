package com.project.agit.common.person

import com.project.agit.common.domain.person.Person
import com.project.agit.common.domain.person.QPerson.person
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository :
    JpaRepository<Person, Long>, PersonRepositoryCustom

interface PersonRepositoryCustom {
    fun findByNameOrNull(name: String?): Person?
}

class PersonRepositoryCustomImpl(
    private val jpaQueryFactory: JPAQueryFactory
) : PersonRepositoryCustom {

    override fun findByNameOrNull(name: String?): Person? {
        return jpaQueryFactory.selectFrom(person)
            .where(person.name.eq(name))
            .fetchOne()
    }
}

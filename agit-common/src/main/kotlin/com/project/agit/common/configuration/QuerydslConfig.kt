package com.project.agit.common.configuration

import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Configuration
class QuerydslConfig(
    @PersistenceContext val em: EntityManager
) {
    @Bean
    fun jpaQueryFactory() = JPAQueryFactory(em)
}

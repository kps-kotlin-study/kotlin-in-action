package com.project.agit.common.domain

import org.springframework.beans.factory.annotation.Value
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.domain.AuditorAware
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.stereotype.Component
import java.lang.IllegalStateException
import java.time.LocalDateTime
import java.util.Optional
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long? = null

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate
    open var createdAt: LocalDateTime = LocalDateTime.now()

    @Column(name = "created_by", updatable = false)
    @CreatedBy
    open var createdBy: String = ""

    @Column(name = "updated_at")
    @LastModifiedDate
    open var updatedAt: LocalDateTime = LocalDateTime.now()

    @Column(name = "updated_by")
    @LastModifiedBy
    open var updateBy: String = ""

    fun getIdOrThrow() = this.id ?: throw IllegalStateException("데이터를 확인할 수 없습니다.")
}

@EnableJpaAuditing
@Component
class AuditorAwareImpl(
    @Value("\${spring.application.name}")
    private val applicationName: String
) : AuditorAware<String> {
    override fun getCurrentAuditor() = Optional.of(applicationName)
}

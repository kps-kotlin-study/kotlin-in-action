package com.project.agit.common.cafe.model

import java.time.ZonedDateTime
import javax.persistence.*

@Entity
@Table(name = "orders")
data class Order (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @Column(name = "user_id", nullable = false)
    val userId: Long,

    @Column(name = "product_id", nullable = false)
    val productId: Long,

    @Column(name = "created_at", nullable = false)
    val createdAt: ZonedDateTime? = ZonedDateTime.now()
) {
    constructor() : this (0, 0, 0)
}



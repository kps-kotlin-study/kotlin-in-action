package com.project.agit.common.cafe.model

import javax.persistence.*

@Entity
@Table(name = "product")
data class Product (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @Column(name = "name", unique = true, nullable = false)
    val name: String,

    @Column(name = "inventory", nullable = true)
    val inventory: Int
) {
    constructor() : this (0, "", 0)
}



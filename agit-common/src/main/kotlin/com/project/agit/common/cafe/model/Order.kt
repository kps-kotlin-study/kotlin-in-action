package com.project.agit.common.cafe.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
@Entity
@Table(name = "order")
data class Order (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @Column(name = "name", unique = true, nullable = false)
    val name: String,

    @Column(name = "age", nullable = false)
    val age: Int
) {
    constructor() : this (0)
}

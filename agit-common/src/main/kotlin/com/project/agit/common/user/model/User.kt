package com.project.agit.common.user.model

import javax.persistence.*


@Entity
@Table(name = "users")
data class User (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @Column(name = "name", unique = true, nullable = false)
    val name: String,

    @Column(name = "age", nullable = false)
    val age: Int,

    @Column(name = "company", nullable = true)
    val company: String,

    @Column(name = "role", nullable = true)
    val role: String,

    @Column(name = "status", nullable = true)
    val status: String,

    @Column(name = "email", unique = true, nullable = false)
    val email: String
)
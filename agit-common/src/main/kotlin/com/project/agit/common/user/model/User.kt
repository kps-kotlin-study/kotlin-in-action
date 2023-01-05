package com.project.agit.common.user.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "user")
data class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @Column(name = "user_name", unique = true, nullable = false)
    val userName: String,

    @Column(name = "email", nullable = false)
    val email: String
) {
    constructor() : this (0, "", "'")
}
package com.project.agit.common.cafe.model

import javax.persistence.*

@Entity
@Table(name = "cafe")
data class Cafe (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?
) {
    constructor() : this (0)
}

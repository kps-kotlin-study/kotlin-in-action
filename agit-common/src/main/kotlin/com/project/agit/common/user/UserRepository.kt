package com.project.agit.common.user

import com.project.agit.common.user.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
//import org.springframework.stereotype.Repositorypository
import org.springframework.stereotype.Repository


@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findByName(name: String): User?
}
package com.project.agit.common.user

import com.project.agit.common.user.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findByName(name: String): User?
//    fun checkUserLocation(user: User, status: Status)

//    fun validationUser(id: Long) {
//        println(this.findById(id))
////        val user = this.findById(id)
//
////        return if (user.status != "cafe") {
////            println("false")
////        }
////        else {
////            println("true")
////        }
//    }
}
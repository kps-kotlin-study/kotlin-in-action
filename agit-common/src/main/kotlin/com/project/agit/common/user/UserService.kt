package com.project.agit.common.user

import com.project.agit.common.user.model.User
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import javax.persistence.EntityManager

@Service
class UserService(
    private val userRepository: UserRepository,
    private val entityManager: EntityManager
//    private val userProperty: UserProperty
) {
//    fun getUserByName(userName: String): User? {
//        return userProperty.userlist.first { it.name == userName }
//    }

//    fun getUserByName(userName: String): List<User> {
//        val query = JPAQuery<User>(entityManager)
//        val user = QUser.user
//
//        return query.from(user)
//            .where(user.name.eq(userName))
//            .fetch()
//    }
    fun getUserByName(userName: String): User? = userRepository.findByName(userName)
    fun getAllUsers(): List<User> = userRepository.findAll()
    fun getUserById(userId: Long): User = userRepository.findById(userId)
        .orElseThrow {
            UserNotFoundException(HttpStatus.NOT_FOUND, "No matching user was found")
        }
    fun createUser(user: List<User>): List<User> = userRepository.saveAll(user)
    fun updateUserById(userId: Long, user: User): User {
        return if (userRepository.existsById(userId)) {
            userRepository.save(
                User(
                    id = user.id,
                    name = user.name,
                    age = user.age,
                    company = user.company,
                    role = user.role,
                    status = user.status,
                    email = user.email
                )
            )
        } else throw UserNotFoundException(HttpStatus.NOT_FOUND, "No matching user was found")
    }

    fun deleteUserById(userId: Long) {
        return if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId)
        } else throw UserNotFoundException(HttpStatus.NOT_FOUND, "No matching user was found")
    }

}
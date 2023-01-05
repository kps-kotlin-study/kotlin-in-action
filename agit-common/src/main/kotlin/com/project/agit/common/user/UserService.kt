package com.project.agit.common.user

import com.project.agit.common.user.model.User
import org.springframework.http.HttpStatus
import com.project.agit.common.user.UserNotFoundException
import com.project.agit.common.user.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun getAllUsers(): List<User> = userRepository.findAll()

    fun getUsersById(userId: Long): User = userRepository.findById(userId)
        .orElseThrow {
            UserNotFoundException(HttpStatus.NOT_FOUND, "No matching user was found")
        }

    fun createUser(user: User): User = userRepository.save(user)
    fun updateUserById(userId: Long, user :User): User {
        return if (userRepository.existsById(userId)) {
            userRepository.save(
                User(
                    id = user.id,
                    userName = user.userName,
                    email = user.email
                )
            )
        } else throw UserNotFoundException(HttpStatus.NOT_FOUND, "No matching user was found")
    }

    fun deleteUsersById(userId: Long) {
        return if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId)
        } else throw UserNotFoundException(HttpStatus.NOT_FOUND, "No matching user was found")
    }

}
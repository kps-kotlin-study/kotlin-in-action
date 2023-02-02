package com.project.agit.common.user

import com.project.agit.common.user.model.User
import com.project.agit.common.user.UserService

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/v1/user")
class UserController(private val userService: UserService) {
    @GetMapping("/")
    fun getAllUsers(): List<User> = userService.getAllUsers()

    @GetMapping("/{id}")
    fun getUsesById(@PathVariable("id") userId: Long): User = userService.getUserById(userId)

    @GetMapping("/name/{name}")
    fun getUserByName(@PathVariable("name") userName: String): User? = userService.getUserByName(userName)

    @PostMapping("/")
    fun createUser(@RequestBody payload: User): User = userService.createUser(payload)

    @PutMapping("/{id}")
    fun updateUserById(@PathVariable("id") userId: Long, @RequestBody payload: User): User = userService.updateUserById(userId, payload)

    @DeleteMapping("/{id}")
    fun deleteUserById(@PathVariable("id") userId: Long): Unit = userService.deleteUserById(userId)
}
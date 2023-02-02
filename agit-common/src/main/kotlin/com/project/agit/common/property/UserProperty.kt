package com.project.agit.common.property

import com.project.agit.common.person.dto.Person
import com.project.agit.common.user.model.User
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.stereotype.Component

@ConfigurationProperties(prefix = "agit.user")
//@ConstructorBinding
@Component
data class UserProperty(
    val userlist: MutableList<User>
)
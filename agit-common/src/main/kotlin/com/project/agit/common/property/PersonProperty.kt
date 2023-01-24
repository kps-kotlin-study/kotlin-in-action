package com.project.agit.common.property

import com.project.agit.common.person.dto.PersonDto
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConfigurationProperties(prefix = "agit.person")
@ConstructorBinding
data class PersonProperty(
    val list: MutableList<PersonDto>
)

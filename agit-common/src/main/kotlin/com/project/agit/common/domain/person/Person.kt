package com.project.agit.common.domain.person

import com.project.agit.common.domain.BaseEntity
import com.project.agit.common.person.constant.Location
import com.project.agit.common.person.dto.PersonDto
import javax.persistence.Entity

@Entity
data class Person(
    var name: String = "",
    var age: Int = 0,
    var location: Location = Location.LOBBY
) : BaseEntity() {
    fun to(): PersonDto =
        PersonDto(
            name = name,
            age = age,
            location = location
        )
}

package com.project.agit.common.person

import com.project.agit.common.person.constant.Location
import com.project.agit.common.person.dto.Person
import com.project.agit.common.property.PersonProperty
import org.springframework.stereotype.Service

@Service
class PersonService(
    private val personProperty: PersonProperty
) {
    fun getPersonInfo(personName: String): Person? {
        return personProperty.list.firstOrNull { it.name == personName }
    }

//    fun setPersonLocation(location: String) {
//        var person: Person
//
//        person.location2 = location
//    }
}

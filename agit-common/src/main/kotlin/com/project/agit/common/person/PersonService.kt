package com.project.agit.common.person

import com.project.agit.common.domain.person.Person
import com.project.agit.common.person.constant.Location
import com.project.agit.common.person.dto.PersonDto
import com.project.agit.common.person.dto.PersonRequest
import com.project.agit.common.property.PersonProperty
import mu.KotlinLogging
import org.springframework.stereotype.Service

private val log = KotlinLogging.logger {}

@Service
class PersonService(
    private val personProperty: PersonProperty,
    private val personRepository: PersonRepository
) {
    fun getPersonInfo(personName: String): Person? {
        return personRepository.findByNameOrNull(personName)
    }

    fun changePersonInfo(person: Person, request: PersonRequest) {
        log.info {
            "Change Location >>>>> " +
                "person : $person" +
                "request : $request"
        }
        personRepository.save(
            person.copy(
                age = request.age ?: person.age,
                location = request.location ?: person.location
            ).apply {
                id = person.id
            }
        )
    }

    fun changePersonLocation(personName: String, location: Location? = Location.LOBBY): Boolean {
        val person = getNotNullPersonInfo(personName)
        if (
            location != Location.LOBBY &&
            person.location != Location.LOBBY
        ) {
            log.error {
                "${person.name} 의 위치는 현재 ${person.location} 이므로 변경 불가능한 상태입니다."
            }
            return false
        } else {
            changePersonInfo(
                person = person,
                request = PersonRequest(
                    age = null,
                    location = location
                )
            )
        }
        return true
    }

    fun isFindPersonInLocation(personName: String, location: Location): Boolean {
        return getNotNullPersonInfo(personName).location == location
    }

    fun getNotNullPersonInfo(personName: String): Person {
        return getPersonInfo(personName)
            ?: throw IllegalArgumentException("$personName 에 대한 유저 정보가 일치하지 않습니다.")
    }

    fun getPersonInfoProperty(personName: String): PersonDto? {
        return personProperty.list.firstOrNull { it.name == personName }
    }

    fun changePersonInfoProperty(person: PersonDto, request: PersonRequest) {
        personProperty.list[personProperty.list.indexOf(person)] = PersonDto(
            name = person.name,
            age = request.age ?: person.age,
            location = request.location ?: person.location
        )
    }

    fun changePersonLocationProperty(personName: String, location: Location? = Location.LOBBY): Boolean {
        val person = getNotNullPersonInfoProperty(personName)
        if (
            location != Location.LOBBY &&
            person.location != Location.LOBBY
        ) {
            log.error {
                "${person.name} 의 위치는 현재 ${person.location} 이므로 변경 불가능한 상태입니다."
            }
            return false
        } else {
            changePersonInfoProperty(
                person = person,
                request = PersonRequest(
                    age = null,
                    location = location
                )
            )
        }
        return true
    }

    fun isFindPersonInLocationProperty(personName: String, location: Location): Boolean {
        return getNotNullPersonInfoProperty(personName).location == location
    }

    fun getNotNullPersonInfoProperty(personName: String): PersonDto {
        return getPersonInfoProperty(personName)
            ?: throw IllegalArgumentException("$personName 에 대한 유저 정보가 일치하지 않습니다.")
    }
}

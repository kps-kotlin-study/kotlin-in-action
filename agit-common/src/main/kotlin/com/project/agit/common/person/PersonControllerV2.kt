package com.project.agit.common.person

import com.project.agit.common.person.dto.PersonResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2/person")
class PersonControllerV2(
    private val personService: PersonService
) {
    @GetMapping("/info")
    fun getPersonInfo(
        @RequestParam("person_name") personName: String
    ) = with(personService.getPersonInfo(personName)) {
        PersonResponse.from(this)
    }
}

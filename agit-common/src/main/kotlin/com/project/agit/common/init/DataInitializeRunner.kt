package com.project.agit.common.init

import com.project.agit.common.domain.person.Person
import com.project.agit.common.person.PersonRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component

@Component
@Profile(value = ["local"])
class DataInitializeRunner(
    private val personRepository: PersonRepository
) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        if(personRepository.findByNameOrNull("brett") == null){
            personRepository.save(
                Person(
                    name = "brett",
                    age = 32
                )
            )
        }
    }
}

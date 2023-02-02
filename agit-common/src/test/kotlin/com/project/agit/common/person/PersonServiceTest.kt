package com.project.agit.common.person

import com.project.agit.common.domain.person.Person
import com.project.agit.common.person.constant.Location
import com.project.agit.common.person.dto.PersonRequest
import com.project.agit.common.property.PersonProperty
import com.project.agit.common.test.IntegrationTest
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk

@IntegrationTest
class PersonServiceTest : BehaviorSpec({
    val personRepository = mockk<PersonRepository>()
    val personProperty = mockk<PersonProperty>()

    val personService = PersonService(personProperty, personRepository)

    val person = Person(
        name = "brett",
        age = 32,
        location = Location.LOBBY
    )
    val request = PersonRequest(
        age = 34,
        location = Location.KAKAO_PAY_SEC
    )
    fun findByNameOrNull(personName: String) = personRepository.findByNameOrNull(personName)
    fun getPersonInfo(personName: String) = personService.getPersonInfo(personName)

    Given("사람 이름이 존재하는 경우") {
        val personName = "brett"

        When("사람 이름이 유저 목록에 있으면") {
            every {
                findByNameOrNull(personName)
            } returns person

            Then("조회 된다") {
                getPersonInfo(personName) shouldBe person
            }
        }

        When("사람 이름이 유저 목록에 없으면") {
            every {
                findByNameOrNull(personName)
            } returns null

            Then("조회 되지 않는다") {
                getPersonInfo(personName) shouldBe null
            }
        }
    }

    afterContainer {
        clearAllMocks()
    }
})

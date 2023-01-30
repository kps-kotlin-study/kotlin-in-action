package com.project.agit.common.company

import com.project.agit.common.domain.company.Company
import com.project.agit.common.domain.company.CompanyPerson
import com.project.agit.common.person.PersonService
import io.kotest.core.spec.style.BehaviorSpec
import io.mockk.every
import io.mockk.mockk

class CompanyCommuteServiceTest : BehaviorSpec({
    val companyPersonService = mockk<CompanyPersonService>()
    val companyService = mockk<CompanyService>()
    val personService = mockk<PersonService>()
    val companyCommuteRepository = mockk<CompanyCommuteRepository>()

    val companyCommuteService = CompanyCommuteService(
            companyPersonService,
            companyService,
            personService,
            companyCommuteRepository
    )

    Given("사람이 회사에 입사해 있는 상황에서") {

        every {
            companyPersonService.getPersonCompany(any())
        } returns CompanyPerson(
                companyId = 1L,
                personId = 1L,
                isJoin = true
        )

        every {
            companyService.getCompany(any())
        } returns Company(
                name = "카카오페이증권",
                type = "SECURITY"
        )

        When("입사를 하면") {
            Then("") {

            }
        }

        When("퇴사를 하면") {
            Then("") {

            }
        }
    }
})
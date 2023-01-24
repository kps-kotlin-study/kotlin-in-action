package com.project.agit.common.company

import com.project.agit.common.company.dto.CompanyJoinRequest
import com.project.agit.common.company.dto.CompanyPersonResponse
import com.project.agit.common.domain.company.CompanyPerson
import com.project.agit.common.domain.person.Person
import com.project.agit.common.person.PersonService
// import mu.KotlinLogging
import org.springframework.stereotype.Service

// private val log = KotlinLogging.logger {}

@Service
class CompanyPersonService(
    private val companyService: CompanyService,
    private val personService: PersonService,
    private val companyPersonRepository: CompanyPersonRepository
) {
    fun join(request: CompanyJoinRequest) {
        // 입사를 위한 전반적인 정보에 대해 체크
        validationCheck(request)

        val personInfo = personService.getPersonInfo(request.personName)
        val companyInfo = companyService.getCompanyInfo(request.companyName)

        companyPersonRepository.save(
            CompanyPerson(
                companyId = companyInfo!!.getIdOrThrow(),
                personId = personInfo!!.getIdOrThrow(),
                team = "", // TODO 회사별 팀 등록 필요
                isJoin = true
            )
        )
    }

    fun getCompanyJoinPersons(companyName: String): List<CompanyPersonResponse> {
        companyValidationCheck(companyName)

        val companyId = companyService.getCompanyInfo(companyName)!!.id

        return companyPersonRepository.findByCompanyId(companyId!!)
            .map(CompanyPerson::to)
            .toList()
    }

    fun getPersonCompany(personName: String): CompanyPerson {

        // 유저 정보 체크
        val personInfo = personService.getPersonInfo(personName)
        personValidationCheck(personInfo, personName)

        return companyPersonRepository.findByPersonId(personInfo!!.id!!)
            ?: throw IllegalArgumentException("입사 이력이 존재하지 않습니다.")
    }

    private fun validationCheck(request: CompanyJoinRequest) {
        // 회사 정보 체크
        companyValidationCheck(request.companyName)

        // 유저 정보 체크
        val personInfo = personService.getPersonInfo(request.personName)
        personValidationCheck(personInfo, request.personName)

        // 기존 입사 상태 체크
        personJoinCompanyValidationCheck(personInfo!!)
    }

    private fun personJoinCompanyValidationCheck(personInfo: Person) {
        // 기존 입사 상태 체크
        // TODO 동명이인에 대한 케이스 처리 필요
        val companyPerson =
            companyPersonRepository.findByPersonId(personInfo!!.id!!)

        require(
            companyPerson == null || !companyPerson.isJoin
        ) {
            "${personInfo.name} 유저는 이미 " +
                companyService.getCompany(companyPerson!!.companyId).name +
                " 회사에 입사한 상태입니다."
        }
    }

    private fun personValidationCheck(personInfo: Person?, personName: String) {
        // 유저 정보 체크
        require(
            personInfo != null
        ) {
            "$personName 에 대한 유저 정보가 일치하지 않습니다."
        }
    }

    private fun companyValidationCheck(companyName: String) {
        // 회사 정보 체크
        require(
            companyService.getCompanyInfo(companyName) != null
        ) {
            "$companyName 에 대한 회사 정보가 일치하지 않습니다."
        }
    }
}

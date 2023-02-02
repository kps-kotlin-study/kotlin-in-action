package com.project.agit.common.company

import com.project.agit.common.company.dto.CompanyCommuteRequest
import com.project.agit.common.company.dto.CompanyCommuteResponse
import com.project.agit.common.domain.company.CompanyCommute
import com.project.agit.common.person.PersonService
import com.project.agit.common.person.constant.Location
import mu.KotlinLogging
import org.springframework.stereotype.Service

private val log = KotlinLogging.logger {}

@Service
class CompanyCommuteService(
    private val companyPersonService: CompanyPersonService,
    private val companyService: CompanyService,
    private val personService: PersonService,
    private val companyCommuteRepository: CompanyCommuteRepository
) {

    fun goToWorkCompany(request: CompanyCommuteRequest) {

        val personCompany = companyPersonService.getPersonCompany(request.personName)
        val company = companyService.getCompany(personCompany.companyId)

        val companyCommute = companyCommuteRepository.findByCompanyNameAndCommutePerson(
            company.name,
            request.personName
        )
        val location = Location.findByDescription(company.name)
            ?: throw IllegalArgumentException("${company.name}을 시스템 내에서 찾을 수가 없습니다.")

        if (
            personService.isFindPersonInLocation(
                personName = request.personName,
                location = location
            ) &&
            companyCommute != null
        ) {
            throw IllegalArgumentException("${request.personName} 는 ${company.name}에 이미 출근한 상태입니다.")
        }

        if (personService.changePersonLocation(request.personName, location)) {
            companyCommuteRepository.save(
                CompanyCommute(
                    companyName = company.name,
                    personName = request.personName
                )
            )
        } else {
            throw IllegalArgumentException("${request.personName} 는 ${company.name} 에 들어갈 수 없는 상태입니다.")
        }
    }

    fun getOffWorkCompany(request: CompanyCommuteRequest) {
        val personCompany = companyPersonService.getPersonCompany(request.personName)
        val company = companyService.getCompany(personCompany.companyId)

        val companyCommute = companyCommuteRepository.findByCompanyNameAndCommutePerson(
            company.name,
            request.personName
        )

        if (
            personService.isFindPersonInLocation(
                personName = request.personName,
                location = Location.findByDescription(company.name)
                    ?: throw IllegalArgumentException("${company.name}을 시스템 내에서 찾을 수가 없습니다.")
            ) &&
            companyCommute != null
        ) {
            if (personService.changePersonLocation(request.personName)) {
                companyCommuteRepository.delete(companyCommute)
//                    ?: throw IllegalArgumentException(
//                        "${company.name} 회사에서 출근한 직원 ${request.personName} 를 찾을 수 없습니다."
//                    )
            } else {
                throw IllegalArgumentException("${request.personName} 위치를 변경하지 못하였습니다.")
            }
        } else {
            val person = personService.getNotNullPersonInfo(request.personName)
            throw IllegalArgumentException(
                "${person.name}는 ${company.name}에 출근해 있지 않습니다. " +
                    "현재 위치는 \"${person.location.description}\" 입니다."
            )
        }
    }

    fun getCommuteCompany(companyName: String, personName: String?): List<CompanyCommuteResponse> {
        return companyCommuteRepository.findAllByCompanyName(companyName).map(CompanyCommute::to).toList()
    }

    fun getCommutePerson(companyName: String, personName: String): String {
        return companyCommuteRepository.findByCompanyNameAndCommutePerson(companyName, personName)?.personName
            ?: throw IllegalArgumentException("$personName 은 $companyName 회사 출근 이력에서 찾을 수 없습니다.")
    }

    fun getCommutePersonName(personName: String): CompanyCommute? {
        return companyCommuteRepository.findByPersonName(personName)
            ?: throw IllegalArgumentException("${personName}을 찾을 수 없습니다.")
    }
}

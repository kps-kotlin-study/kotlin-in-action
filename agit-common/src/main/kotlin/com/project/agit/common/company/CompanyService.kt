package com.project.agit.common.company

import com.project.agit.common.company.dto.CompanyDto
import com.project.agit.common.company.dto.CompanyPropertyResponse
import com.project.agit.common.company.dto.CompanyRequest
import com.project.agit.common.company.dto.CompanyResponse
import com.project.agit.common.domain.company.Company
import com.project.agit.common.property.CompanyProperty
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class CompanyService(
    private val companyProperty: CompanyProperty,
    private val companyRepository: CompanyRepository
) {
    fun getCompany(companyId: Long): Company {
        return companyRepository.findByIdOrNull(companyId)
            ?: throw IllegalStateException("찾을 수 없습니다.")
    }

    fun registerCompany(request: CompanyRequest): Company {
        throwIfExistCompanyName(request.name)
        return companyRepository.save(
            Company(
                name = request.name,
                type = request.type
            )
        )
    }

    fun getCompanyInfo(companyName: String): Company? {
        return companyRepository.findByNameOrNull(companyName)
    }

    fun getCompanyProperty(companyId: Long): CompanyDto {
        return companyProperty.list.first { it.id == companyId }
    }

    fun getCompanyAll(): List<CompanyResponse> {
        return companyRepository.findAll().map(Company::to).toList()
    }

    fun registerCompanyProperty(request: CompanyRequest): CompanyDto {
        throwIfExistCompanyPropertyName(request.name)
        val list = companyProperty.list
        val newCompanyDto = CompanyDto(
            id = (list.size + 1).toLong(),
            name = request.name,
            type = request.type
        )
        list.add(newCompanyDto)
        return newCompanyDto
    }

    fun getCompanyInfoProperty(companyName: String): CompanyDto? {
        return companyProperty.list
            .firstOrNull { it.name == companyName }
    }

    fun getCompanyAllProperty(): List<CompanyPropertyResponse> {
        return companyProperty.list.map(CompanyDto::to).toList()
    }

    internal fun throwIfExistCompanyName(
        name: String,
        message: String = "기존에 동일한 회사 이름이 있습니다."
    ) {
        require(companyRepository.findByNameOrNull(name) == null) {
            message
        }
    }

    internal fun throwIfExistCompanyPropertyName(
        name: String,
        message: String = "기존에 동일한 회사 이름이 있습니다."
    ) {
        require(companyProperty.list.firstOrNull { it.name == name } == null) {
            message
        }
    }
}

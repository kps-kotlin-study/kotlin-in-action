package com.project.agit.common.company

import com.project.agit.common.company.dto.CompanyPropertyResponse
import com.project.agit.common.company.dto.CompanyRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v2/company")
class CompanyController(
    private val companyService: CompanyService
) {

    @GetMapping("/{company_id}")
    fun getCompany(
        @PathVariable("company_id") companyId: Long
    ) = with(companyService.getCompanyProperty(companyId)) {
        CompanyPropertyResponse.from(this)
    }

    @PostMapping("")
    fun registerCompany(
        @RequestBody request: CompanyRequest
    ) = with(companyService.registerCompanyProperty(request)) {
        CompanyPropertyResponse.from(this)
    }

    @GetMapping("/info")
    fun getCompanyInfo(
        @RequestParam("company_name") companyName: String
    ) = with(companyService.getCompanyInfoProperty(companyName)) {
        CompanyPropertyResponse.from(this)
    }

    @GetMapping("/all")
    fun getCompanyAll() = with(companyService.getCompanyAllProperty()) {
        this
    }
}

package com.project.agit.common.company

import com.project.agit.common.company.dto.CompanyPropertyResponse
import com.project.agit.common.company.dto.CompanyRequest
import com.project.agit.common.user.UserService
import com.project.agit.common.user.model.User
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/v2/company")
class CompanyController(
    private val companyService: CompanyService
    , private val userService: UserService
) {

    @GetMapping("/{company_id}")
    fun getCompany(
        @PathVariable("company_id") companyId: Long
    ) = with(companyService.getCompanyProperty(companyId)) {
        CompanyPropertyResponse.from(this)
    }

    @PostMapping("/checkin/{user_id}")
    fun checkIn (
        @PathVariable("user_id") userId: Long,
        @RequestBody payload: User
    ): User = userService.updateUserById(userId, payload)

    @PostMapping("/checkout/{user_id}")
    fun checkOut (
        @PathVariable("user_id") userId: Long,
        @RequestBody payload: User
    ): User = userService.updateUserById(userId, payload)

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

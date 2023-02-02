package com.project.agit.common.cafe

import com.project.agit.common.cafe.model.Order
import com.project.agit.common.cafe.model.Product
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/cafe")
class CafeController (
    private val cafeService: CafeService
)
{
    @PostMapping("/product")
    fun createProduct(@RequestBody payload: List<Product>): List<Product> = cafeService.addProduct(payload)
    @GetMapping("/menu")
    fun getMenuAll(): List<Product> = cafeService.getMenuAll()

    @PostMapping("/order")
    fun createOrder(@RequestBody payload: Order): Order = cafeService.order(payload)

    @GetMapping("/orderlist")
    fun getOrderAll(): List<Order> = cafeService.getOrderAll()

    @GetMapping("/order/user/{id}")
    fun getUserOrderList(@PathVariable("id") userId: Long): List<Order> = cafeService.getOrderByUser(userId)
}

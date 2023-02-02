package com.project.agit.common.cafe

import com.project.agit.common.cafe.model.Order
import com.project.agit.common.cafe.model.Product

import org.springframework.stereotype.Service

@Service
class CafeService (
    private val orderRepository: OrderRepository,
    private val productRepository: ProductRepository
) {
    fun addProduct(product: List<Product>): List<Product> = productRepository.saveAll(product)
    fun getMenuAll(): List<Product> = productRepository.findAll()

    fun order(order: Order): Order = orderRepository.save(order)

    fun getOrderAll(): List<Order> = orderRepository.findAll()

    fun getOrderByUser(userId: Long): List<Order> = orderRepository.findOrderByUserId(userId)
}



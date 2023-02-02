package com.project.agit.common.cafe

import com.project.agit.common.cafe.model.Order
import com.project.agit.common.cafe.model.Product

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository : JpaRepository<Order, Long> {
    fun findOrderByUserId(userId: Long): List<Order>
}
@Repository
interface ProductRepository : JpaRepository<Product, Long> {
    fun findByName(name: String): Product?
}


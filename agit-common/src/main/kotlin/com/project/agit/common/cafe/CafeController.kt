package com.project.agit.common.cafe

import com.project.agit.common.cafe.dto.CafeMenu
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/cafe")
class CafeController (
    private val cafeService: CafeService = CafeService(),
    private var cafeMenu: MutableList<CafeMenu> = mutableListOf (
        CafeMenu(1, "Americano", 1000, 100),
        CafeMenu(2, "CaffeLatte", 2000, 100),
        CafeMenu(3, "YujaTea", 3000, 100)
    )
) {
    @GetMapping("/menu")
    fun getMenuAll(): MutableList<CafeMenu> {
        return cafeMenu
    }
    @GetMapping("/menu/{menuId}")
    fun getMenuOne(@PathVariable("menuId") menuId: Int): CafeMenu {
        for (i in cafeMenu.indices) {
            if ( menuId == cafeMenu[i].productId ) {
                return cafeMenu[i]
            } else {
            }
        }
        return TODO("Provide the return value")
    }
    @PostMapping("/order/{menuId}")
    fun order(@RequestBody orderMenu: OrderMenu): OrderResponse {
        return cafeService.order(orderMenu, cafeMenu)
//        val coffeeCnt = CafeService().orderCoffee()
//        return ResponseEntity.ok().body("You have got just 1 coffee, then $coffeeCnt coffees left.")
    }
}

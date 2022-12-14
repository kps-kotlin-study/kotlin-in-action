package com.project.agit.common.cafe

import com.project.agit.common.cafe.dto.CafeMenu
import com.project.agit.common.person.PersonService
import com.project.agit.common.person.dto.Person

import org.springframework.web.bind.annotation.RequestBody
import javax.websocket.server.PathParam

//enum class Menu (
//    val id: Int
//){
//    Americano(1),
//    CaffeLatte(2),
//    YujaTea(3)
//
////    fun getMenuById(id: Int): Menu? = Menu.values().firstOrNull() { it.id == id };
//}
class CafeService {
//    companion object {
//        var coffee = 100
//    }
//    private val cafeMenu: List<CafeMenu> = listOf (
//        CafeMenu(1, "Americano", 1000, 100),
//        CafeMenu(2, "CaffeLatte", 2000, 100),
//        CafeMenu(3, "YujaTea", 3000, 100)
//    )
//
//    fun getMenuAll(): List<CafeMenu> {
//        return this.cafeMenu
//    }
//    fun getMenuAll(): String {
//        var res: String = ""
//        Menu.values().forEach { res += "$it, " }
//        return res
//    }
//    fun getMenuOne(menuId: Int): String {
//        if (menuId == Menu.Americano.id) {
//
//        }
//
//        for (menuId == Menu.values().id )
//
//        return Menu.valueOf(menuId)
//    }
    fun order(orderMenu: OrderMenu, cafeMenu: MutableList<CafeMenu>): OrderResponse {
        var res: OrderResponse = OrderResponse(0, "", 0)

        for (i in cafeMenu.indices) {
            if (orderMenu.menuId == cafeMenu[i].productId) {
                res.menuId = orderMenu.menuId
                res.menuName = cafeMenu[i].productName
                res.orderPersonId = orderMenu.orderPersonId
                res.menuStock =

                // set person location

                return res
            }
        }
        return TODO("Provide the return value")
    }
}
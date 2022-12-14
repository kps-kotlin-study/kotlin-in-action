package com.project.agit.common.cafe

//class MenuStatus {
//    val menuId: Int
//}

data class OrderResponse(
    var menuId: Int = 0,
    var menuName: String = "",
    var orderPersonId: Int = 0,
    var menuStock: Int

)
class CafeResponse

package com.example.infernolounge.domain.user

import java.util.Date

data class User(
    val userId: Int,
    var userName: String,
    var userLastName: String,
    var userEmail: String,
    var userSex: Int,
    var userBirthDate: Date,
    var userTelephoneNumber: String,
    var userPassword: String,
    val userCardId: Int,
    val userCardCount: Int,
    var userHookahCount: Int,
//    var userOrders: List<>
)

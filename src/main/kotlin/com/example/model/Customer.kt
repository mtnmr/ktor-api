package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Customer(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String
)

//実際のアプリケーションではデータベースを使用する
val customerStorage = mutableListOf<Customer>()
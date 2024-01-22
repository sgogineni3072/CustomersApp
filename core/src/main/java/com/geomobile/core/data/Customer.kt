package com.geomobile.core.data

data class Customer(
    val id: Long,
    val firstName: String,
    val lastName: String,
    val email: String?,
    val avatar: String?
)
package com.geomobile.customersapp.framework.db

import androidx.room.Entity
import com.geomobile.core.data.Customer

@Entity(tableName = "customer")
data class CustomerEntity(
    val id: Long,
    val firstName: String,
    val lastName: String,
    val email: String?,
    val avatar: String?
) {
    companion object {
        fun fromCustomer(customer: Customer) = CustomerEntity(
            customer.id,
            customer.firstName,
            customer.lastName,
            customer.email,
            customer.avatar
        )
    }

    fun toCustomer() = Customer(id, firstName, lastName, email, avatar)
}
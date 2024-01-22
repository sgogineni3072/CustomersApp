package com.geomobile.core.repository

import com.geomobile.core.data.Customer

interface CustomerDataSource {
    suspend fun getAllCustomers(): List<Customer>
}
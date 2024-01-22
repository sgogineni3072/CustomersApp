package com.geomobile.core.repository

class CustomerRepository(private val dataSource: CustomerDataSource) {
    suspend fun getAllCustomers() = dataSource.getAllCustomers()
}
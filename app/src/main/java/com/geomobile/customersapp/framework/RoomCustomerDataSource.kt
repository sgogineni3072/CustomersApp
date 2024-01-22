package com.geomobile.customersapp.framework

import android.content.Context
import com.geomobile.core.data.Customer
import com.geomobile.core.repository.CustomerDataSource
import com.geomobile.customersapp.framework.db.DatabaseService

class RoomCustomerDataSource(context: Context): CustomerDataSource {
    val customerDao = DatabaseService.getInstance(context).customerDao()
    override suspend fun getAllCustomers() = customerDao.getAllCustomerEntities()
        .map { it.toCustomer() }
}
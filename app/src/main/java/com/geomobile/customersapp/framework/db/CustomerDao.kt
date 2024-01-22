package com.geomobile.customersapp.framework.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface CustomerDao {
    @Insert(onConflict = REPLACE)
    suspend fun addCustomerEntity(customerEntity: CustomerEntity)

    @Query("SELECT * FROM customer WHERE id = :id")
    suspend fun getCustomerEntity(id: Long): CustomerEntity?

    @Query("SELECT * FROM customer")
    suspend fun getAllCustomerEntities(): List<CustomerEntity>

    @Delete
    suspend fun deleteCustomerEntity(customerEntity: CustomerEntity)
}
package com.geomobile.core.network

import com.geomobile.core.data.Customer
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface MockApi {

    @GET("api/users") // api/users?per_page=10"
    suspend fun getAllCustomers(): List<Customer>
}

fun createMockApi(): MockApi {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://reqres.in/") // https://reqres.in/api/users?per_page=10
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    return retrofit.create(MockApi::class.java)
}
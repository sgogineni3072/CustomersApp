package com.geomobile.core.usecase

import com.geomobile.core.repository.CustomerRepository

class GetAllCustomers(private val customerRepository: CustomerRepository) {
    suspend operator fun invoke() = customerRepository.getAllCustomers()
}
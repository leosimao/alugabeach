package com.deveasy.alugabeach.core

import com.deveasy.alugabeach.domain.dto.CreateUserDTO
import com.deveasy.alugabeach.domain.dto.ResponseCreateUserDTO
import com.deveasy.alugabeach.domain.dto.ResponseUserDTO

interface UserUseCase {

    fun createUser(createUserDTO: CreateUserDTO): ResponseCreateUserDTO

    fun getAllUsers(): List<ResponseUserDTO>
}
package com.deveasy.alugabeach.application

import com.deveasy.alugabeach.application.enums.Roles
import com.deveasy.alugabeach.application.enums.StatusCode
import com.deveasy.alugabeach.core.GenericPersistence
import com.deveasy.alugabeach.core.UserUseCase
import com.deveasy.alugabeach.domain.dto.CreateUserDTO
import com.deveasy.alugabeach.domain.dto.ResponseCreateUserDTO
import com.deveasy.alugabeach.domain.dto.ResponseUserDTO
import com.deveasy.alugabeach.domain.model.User

class UserUseCaseImplementation(
    val userRepository: GenericPersistence<User>,
): UserUseCase {

    override fun createUser(createUserDTO: CreateUserDTO): ResponseCreateUserDTO {
        val user = User(
            name = createUserDTO.name,
            password = createUserDTO.password,
            email = createUserDTO.email,
            role = Roles.CUSTOMER
        )

        userRepository.create(user)

        return ResponseCreateUserDTO(
            StatusCode.CREATED.code,
            "User Created",
        )
    }

    override fun getAllUsers(): List<ResponseUserDTO> {
        val allUsers = userRepository.findAll()
        return allUsers.map { ResponseUserDTO(it.name, it.email) }
    }

}
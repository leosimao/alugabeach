package com.deveasy.alugabeach.application

import com.deveasy.alugabeach.application.enums.Roles
import com.deveasy.alugabeach.application.enums.StatusCode
import com.deveasy.alugabeach.core.UserUseCase
import com.deveasy.alugabeach.domain.dto.CreateUserDTO
import com.deveasy.alugabeach.domain.dto.ResponseCreateUserDTO
import com.deveasy.alugabeach.domain.dto.ResponseUserDTO
import com.deveasy.alugabeach.domain.mappers.GenericMapper
import com.deveasy.alugabeach.domain.model.User
import com.deveasy.alugabeach.infrastructure.model.UserEntity
import com.deveasy.alugabeach.infrastructure.repository.UserRepository

class UserUseCaseImplementation(
    val userRepository: UserRepository,
    val userMapper: GenericMapper<User, UserEntity>
): UserUseCase {

    override fun createUser(createUserDTO: CreateUserDTO): ResponseCreateUserDTO {
        val user = User(
            name = createUserDTO.name,
            password = createUserDTO.password,
            email = createUserDTO.email,
            role = Roles.CUSTOMER
        )

        val userEntity = userMapper.toEntity(user)
        userRepository.save(userEntity)

        return ResponseCreateUserDTO(
            StatusCode.CREATED.code,
            "User Created",
        )
    }

    override fun getAllUsers(): List<ResponseUserDTO> {
        val allUsersEntity = userRepository.findAll()
        val allUsers = allUsersEntity.map { userMapper.toDomain(it) }

        return allUsers.map { ResponseUserDTO(it.name, it.email) }
    }

}
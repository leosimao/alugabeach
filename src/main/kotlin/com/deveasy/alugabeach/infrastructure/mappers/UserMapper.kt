package com.deveasy.alugabeach.infrastructure.mappers

import com.deveasy.alugabeach.domain.model.User
import com.deveasy.alugabeach.infrastructure.model.UserEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface UserMapper {

    fun toEntity(user: User): UserEntity

    fun toDomain(userEntity: UserEntity): User

}
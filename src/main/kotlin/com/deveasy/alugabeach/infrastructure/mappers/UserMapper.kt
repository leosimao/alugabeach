package com.deveasy.alugabeach.infrastructure.mappers

import com.deveasy.alugabeach.core.GenericMapper
import com.deveasy.alugabeach.domain.model.User
import com.deveasy.alugabeach.infrastructure.model.UserEntity
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface UserMapper: GenericMapper<User, UserEntity> {

    override fun toEntity(domain: User): UserEntity

    override fun toDomain(entity: UserEntity): User

}
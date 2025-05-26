package com.deveasy.alugabeach.infrastructure.mappers

import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface Mapper<TDomain, TEntity> {

    fun toDomain(userEntity: TEntity): TDomain

    fun toEntity(userDomain: TDomain): TEntity
}
package com.deveasy.alugabeach.core

interface GenericMapper<TDomain, TEntity> {

    fun toEntity(domain: TDomain): TEntity

    fun toDomain(entity: TEntity): TDomain
}
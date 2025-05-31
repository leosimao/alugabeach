package com.deveasy.alugabeach.core

interface GenericPersistence<TDomain> {

    fun create(domain: TDomain): TDomain

    fun findByUUID(uuid: String?): TDomain

    fun findAll(): List<TDomain>

    fun update(domain: TDomain): TDomain

    fun delete(uuid: String?)

}
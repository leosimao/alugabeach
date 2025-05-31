package com.deveasy.alugabeach.infrastructure.persistence

import com.deveasy.alugabeach.domain.model.User
import com.deveasy.alugabeach.infrastructure.mappers.UserMapper
import com.deveasy.alugabeach.infrastructure.model.UserEntity
import com.deveasy.alugabeach.infrastructure.repository.UserRepository

class UserPersistence(
    mapper: UserMapper,
    repository: UserRepository
): GenericPersistenceImplementation<User, UserEntity, UserRepository, UserMapper>(
    mapper,
    repository
)
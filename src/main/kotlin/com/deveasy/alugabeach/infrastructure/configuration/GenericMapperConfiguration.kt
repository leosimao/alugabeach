package com.deveasy.alugabeach.infrastructure.configuration

import com.deveasy.alugabeach.core.GenericPersistence
import com.deveasy.alugabeach.domain.model.User
import com.deveasy.alugabeach.infrastructure.mappers.UserMapper
import com.deveasy.alugabeach.infrastructure.persistence.UserPersistence
import com.deveasy.alugabeach.infrastructure.repository.UserRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GenericMapperConfiguration {

    @Bean
    fun userPersistence(userMapper: UserMapper, userRepository: UserRepository): GenericPersistence<User> = UserPersistence(
        userMapper,
        userRepository
    )

}
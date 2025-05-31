package com.deveasy.alugabeach.infrastructure.persistence

import com.deveasy.alugabeach.core.GenericMapper
import com.deveasy.alugabeach.core.GenericPersistence
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.findByIdOrNull
import java.util.UUID

abstract class GenericPersistenceImplementation<
        TDomain,
        TEntity: Any,
        TRepository: CrudRepository<TEntity, UUID>,
        TMapper: GenericMapper<TDomain, TEntity>,
>(
    private val entityMapper: TMapper,
    private val repository: TRepository
): GenericPersistence<TDomain> {

    override fun create(domain: TDomain): TDomain {
        val entity = entityMapper.toEntity(domain)
        val savedEntity = repository.save(entity)
        return entityMapper.toDomain(savedEntity)
    }

    override fun findByUUID(uuid: String?): TDomain {
        if (uuid == null) {
            throw IllegalArgumentException("UUID not be null")
        }
        val toUUID = UUID.fromString(uuid)
        val foundEntity = repository.findByIdOrNull(toUUID)
            ?: throw IllegalArgumentException("Entity not found: $toUUID")

        return entityMapper.toDomain(foundEntity)
    }

    override fun findAll(): List<TDomain> {
        val entities = repository.findAll()
        return entities.map { entityMapper.toDomain(it) }
    }

    override fun update(domain: TDomain): TDomain {
        val entity = entityMapper.toEntity(domain)
        val updatedEntity = repository.save(entity)
        return entityMapper.toDomain(updatedEntity)
    }

    override fun delete(uuid: String?) {
        if (uuid == null) {
            throw IllegalArgumentException("UUID not be null")
        }
        val toUUID = UUID.fromString(uuid)
        repository.deleteById(toUUID)
    }

}
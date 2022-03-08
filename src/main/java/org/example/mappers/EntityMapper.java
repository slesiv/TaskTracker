package org.example.mappers;

public interface EntityMapper<E, Dto> {
    Dto toDto(E entity);
    E toEntity(Dto entityDto);
}

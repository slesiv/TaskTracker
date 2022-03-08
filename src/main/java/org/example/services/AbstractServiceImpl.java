package org.example.services;

import org.example.dto.CommonDto;
import org.example.entities.AbstractEntity;
import org.example.exception.GlobalExceptionHandler;
import org.example.mappers.EntityMapper;
import org.example.repositories.EntityRepository;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractServiceImpl<E extends AbstractEntity, DTO extends CommonDto>
        implements EntityService<E, DTO> {

    private EntityMapper<E, DTO> mapper;
    private EntityRepository<E> repository;

    public AbstractServiceImpl(EntityMapper<E, DTO> mapper, EntityRepository<E> repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public DTO create(DTO entityDto) {
        return mapper.toDto(
                repository.save(
                    mapper.toEntity(entityDto)));
    }

    @Override
    public List<DTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        E entity = repository.findById(id)
                        .orElseThrow(() -> new GlobalExceptionHandler());
        repository.delete(entity);
    }

    //TODO Надо закончить метод update()
    @Override
    public DTO update(DTO entityDto) {
        return null;
    }
}

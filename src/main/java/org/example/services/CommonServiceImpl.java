package org.example.services;

import org.example.dto.CommonDto;
import org.example.entities.AbstractEntity;
import org.example.exception.GlobalExceptionHandler;
import org.example.mappers.EntityMapper;
import org.example.repositories.EntityRepository;

import java.util.List;
import java.util.stream.Collectors;

public abstract class CommonServiceImpl<E extends AbstractEntity, D extends CommonDto>
        implements CommonService<E, D> {

    private EntityMapper<E, D> mapper;
    private EntityRepository<E> repository;

    public CommonServiceImpl(EntityMapper<E, D> mapper, EntityRepository<E> repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public D create(D entityDto) {
        return mapper.toDto(
                repository.save(
                    mapper.toEntity(entityDto)));
    }

    @Override
    public List<D> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public D findByID(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow(() -> new GlobalExceptionHandler()));
    }

    @Override
    public void delete(Long id) {
        E entity = repository.findById(id)
                        .orElseThrow(() -> new GlobalExceptionHandler());
        repository.delete(entity);
    }

    //TODO Надо закончить метод update()
    @Override
    public D update(D entityDto) {
        return null;
    }
}

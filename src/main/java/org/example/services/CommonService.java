package org.example.services;

import org.example.dto.CommonDto;
import org.example.entities.AbstractEntity;

import java.util.List;

public interface CommonService<E extends AbstractEntity, DTO extends CommonDto> {
    DTO create(DTO projectDto);
    List<DTO> findAll();
    void delete(Long id);
    DTO update(DTO projectDto);
}

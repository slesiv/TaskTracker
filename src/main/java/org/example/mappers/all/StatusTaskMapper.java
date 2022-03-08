package org.example.mappers.all;

import org.example.dto.all.ReleaseDto;
import org.example.dto.all.StatusTaskDto;
import org.example.entities.all.Release;
import org.example.entities.all.StatusTask;
import org.example.mappers.EntityMapper;
import org.springframework.stereotype.Component;

@Component
public class StatusTaskMapper implements EntityMapper<StatusTask, StatusTaskDto> {
    @Override
    public StatusTaskDto toDto(StatusTask entity) {
        StatusTaskDto entityDto = new StatusTaskDto();
        entityDto.setId(entity.getId());
        entityDto.setName(entity.getName());
        return entityDto;
    }

    @Override
    public StatusTask toEntity(StatusTaskDto entityDto) {
        StatusTask entity = new StatusTask();
        entity.setName(entityDto.getName());
        return entity;
    }
}

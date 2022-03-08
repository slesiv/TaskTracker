package org.example.mappers.all;

import org.example.dto.all.HistoryProjectDto;
import org.example.dto.all.HistoryTaskDto;
import org.example.entities.all.HistoryProject;
import org.example.entities.all.HistoryTask;
import org.example.mappers.EntityMapper;
import org.springframework.stereotype.Component;

@Component
public class HistoryTaskMapper implements EntityMapper<HistoryTask, HistoryTaskDto> {
    @Override
    public HistoryTaskDto toDto(HistoryTask entity) {
        HistoryTaskDto entityDto = new HistoryTaskDto();
        entityDto.setId(entity.getId());
        entityDto.setTask(entity.getTask());
        entityDto.setChanged(entity.getChanged());
        entityDto.setStatus(entity.getStatus());
        entityDto.setUser(entity.getUser());
        return entityDto;
    }

    @Override
    public HistoryTask toEntity(HistoryTaskDto entityDto) {
        HistoryTask entity = new HistoryTask();
        entity.setTask(entityDto.getTask());
        entity.setChanged(entityDto.getChanged());
        entity.setStatus(entityDto.getStatus());
        entity.setUser(entityDto.getUser());
        return entity;
    }
}

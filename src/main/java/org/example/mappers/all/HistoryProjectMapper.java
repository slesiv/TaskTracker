package org.example.mappers.all;

import org.example.dto.all.HistoryProjectDto;
import org.example.entities.all.HistoryProject;
import org.example.mappers.EntityMapper;
import org.springframework.stereotype.Component;

@Component
public class HistoryProjectMapper implements EntityMapper<HistoryProject, HistoryProjectDto> {
    @Override
    public HistoryProjectDto toDto(HistoryProject entity) {
        HistoryProjectDto entityDto = new HistoryProjectDto();
        entityDto.setId(entity.getId());
        entityDto.setProject(entity.getProject());
        entityDto.setChanged(entity.getChanged());
        entityDto.setStatus(entity.getStatus());
        entityDto.setUser(entity.getUser());
        return entityDto;
    }

    @Override
    public HistoryProject toEntity(HistoryProjectDto entityDto) {
        HistoryProject entity = new HistoryProject();
        entity.setProject(entityDto.getProject());
        entity.setChanged(entityDto.getChanged());
        entity.setStatus(entityDto.getStatus());
        entity.setUser(entityDto.getUser());
        return entity;
    }
}

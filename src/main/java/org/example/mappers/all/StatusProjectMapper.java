package org.example.mappers.all;

import org.example.dto.all.StatusProjectDto;
import org.example.entities.all.StatusProject;
import org.example.mappers.EntityMapper;
import org.springframework.stereotype.Component;

@Component
public class StatusProjectMapper implements EntityMapper<StatusProject, StatusProjectDto> {

    @Override
    public StatusProjectDto toDto(StatusProject sp) {
        StatusProjectDto spDto = new StatusProjectDto();
        spDto.setId(sp.getId());
        spDto.setName(sp.getName());
        return spDto;
    }

    @Override
    public StatusProject toEntity(StatusProjectDto spDto) {
        StatusProject sp = new StatusProject();
        sp.setName(spDto.getName());
        return sp;
    }
}
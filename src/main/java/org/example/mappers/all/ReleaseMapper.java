package org.example.mappers.all;

import org.example.dto.all.ReleaseDto;
import org.example.entities.all.Release;
import org.example.mappers.EntityMapper;
import org.springframework.stereotype.Component;

@Component
public class ReleaseMapper implements EntityMapper<Release, ReleaseDto> {
    @Override
    public ReleaseDto toDto(Release entity) {
        ReleaseDto entityDto = new ReleaseDto();
        entityDto.setId(entity.getId());
        entityDto.setNumber(entity.getNumber());
        entityDto.setStart(entity.getStart());
        entityDto.setFinish(entity.getFinish());
        return entityDto;
    }

    @Override
    public Release toEntity(ReleaseDto entityDto) {
        Release entity = new Release();
        entity.setNumber(entityDto.getNumber());
        entity.setStart(entityDto.getStart());
        entity.setFinish(entityDto.getFinish());
        return entity;
    }
}
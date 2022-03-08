package org.example.mappers.all;

import org.example.dto.all.AccessDto;
import org.example.entities.all.Access;
import org.example.mappers.EntityMapper;
import org.springframework.stereotype.Component;

@Component
public class AccessMapper implements EntityMapper<Access, AccessDto> {

    @Override
    public AccessDto toDto(Access entity) {
        AccessDto entityDto = new AccessDto();
        entityDto.setId(entity.getId());
        entityDto.setProject(entity.getProject());
        entityDto.setRole(entity.getRole());
        entityDto.setUser((entity.getUser()));
        return entityDto;
    }

    @Override
    public Access toEntity(AccessDto entityDto) {
        Access entity = new Access();
        entity.setProject(entityDto.getProject());
        entity.setRole(entityDto.getRole());
        entity.setUser((entityDto.getUser()));
        return entity;
    }
}

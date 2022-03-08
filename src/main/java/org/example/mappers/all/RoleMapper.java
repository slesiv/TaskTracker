package org.example.mappers.all;

import org.example.dto.all.RoleDto;
import org.example.entities.all.Role;
import org.example.mappers.EntityMapper;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper implements EntityMapper<Role, RoleDto> {

    public RoleDto toDto(Role role) {
        RoleDto roleDto = new RoleDto();
        roleDto.setId(role.getId());
        roleDto.setName(role.getName());
        return  roleDto;
    }

    public Role toEntity(RoleDto roleDto) {
        Role role = new Role();
        role.setName(roleDto.getName());
        return role;
    }
}

package org.example.mappers.all;

import org.example.dto.all.UserDto;
import org.example.entities.all.User;
import org.example.mappers.EntityMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements EntityMapper<User, UserDto> {
    @Override
    public UserDto toDto(User entity) {
        UserDto uDto = new UserDto();
        uDto.setId(entity.getId());
        uDto.setFirstName(entity.getFirstName());
        uDto.setLastName(entity.getLastName());
        uDto.setEmail(entity.getEmail());
        uDto.setPassword(entity.getPassword());
        return uDto;
    }

    @Override
    public User toEntity(UserDto entityDto) {
        User u = new User();
        u.setFirstName(entityDto.getFirstName());
        u.setLastName(entityDto.getLastName());
        u.setEmail(entityDto.getEmail());
        u.setPassword(entityDto.getPassword());
        return u;
    }
}

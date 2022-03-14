package org.example.services.all;

import org.example.dto.all.UserDto;
import org.example.entities.all.User;
import org.example.mappers.all.UserMapper;
import org.example.repositories.all.UserRepository;
import org.example.services.CommonServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserService extends CommonServiceImpl<User, UserDto> {
    public UserService(UserMapper mapper, UserRepository repository) {
        super(mapper, repository);
    }
}

package org.example.controllers.all;

import org.example.controllers.AbstractController;
import org.example.dto.all.UserDto;
import org.example.entities.all.User;
import org.example.services.all.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends AbstractController<User, UserDto> {
    public UserController(UserService service) {
        super(service);
    }
}

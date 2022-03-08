package org.example.mappers.controllers.all;

import org.example.mappers.controllers.AbstractController;
import org.example.dto.all.RoleDto;
import org.example.entities.all.Role;
import org.example.services.all.RoleServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController extends AbstractController<Role, RoleDto> {

    public RoleController(RoleServiceImpl service) {
        super(service);
    }
}

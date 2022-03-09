package org.example.controllers.all;

import org.example.controllers.AbstractController;
import org.example.dto.all.AccessDto;
import org.example.entities.all.Access;
import org.example.services.all.AccessService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/access")
public class AccessController extends AbstractController<Access, AccessDto> {
    public AccessController(AccessService service) {
        super(service);
    }
}

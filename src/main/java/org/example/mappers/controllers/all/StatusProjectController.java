package org.example.mappers.controllers.all;

import org.example.mappers.controllers.AbstractController;
import org.example.dto.all.StatusProjectDto;
import org.example.entities.all.StatusProject;
import org.example.services.all.StatusProjectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/statusproject")
public class StatusProjectController extends AbstractController<StatusProject, StatusProjectDto> {

    public StatusProjectController(StatusProjectService service) {
        super(service);
    }
}

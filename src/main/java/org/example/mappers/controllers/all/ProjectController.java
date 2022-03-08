package org.example.mappers.controllers.all;

import org.example.mappers.controllers.AbstractController;
import org.example.dto.all.ProjectDto;
import org.example.entities.all.Project;
import org.example.services.all.ProjectService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class ProjectController extends AbstractController<Project, ProjectDto> {
    public ProjectController(ProjectService service) {
        super(service);
    }
}

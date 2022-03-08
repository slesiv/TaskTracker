package org.example.mappers.controllers.all;

import org.example.mappers.controllers.AbstractController;
import org.example.dto.all.StatusTaskDto;
import org.example.entities.all.StatusTask;
import org.example.services.all.StatusTaskService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/statustask")
public class StatusTaskController extends AbstractController<StatusTask, StatusTaskDto> {
    public StatusTaskController(StatusTaskService service) {
        super(service);
    }
}

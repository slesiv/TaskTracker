package org.example.controllers.all;

import org.example.controllers.AbstractController;
import org.example.dto.all.TaskDto;
import org.example.entities.all.Task;
import org.example.services.all.TaskService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController extends AbstractController<Task, TaskDto> {
    public TaskController(TaskService service) {
        super(service);
    }
}

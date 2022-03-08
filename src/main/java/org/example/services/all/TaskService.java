package org.example.services.all;

import org.example.dto.all.TaskDto;
import org.example.entities.all.Task;
import org.example.mappers.all.TaskMapper;
import org.example.repositories.all.TaskRepository;
import org.example.services.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TaskService extends AbstractServiceImpl<Task, TaskDto> {
    public TaskService(TaskMapper mapper, TaskRepository repository) {
        super(mapper, repository);
    }
}

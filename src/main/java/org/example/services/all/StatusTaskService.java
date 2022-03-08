package org.example.services.all;

import org.example.dto.all.StatusTaskDto;
import org.example.entities.all.StatusTask;
import org.example.mappers.all.StatusTaskMapper;
import org.example.repositories.all.StatusTaskRepository;
import org.example.services.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class StatusTaskService extends AbstractServiceImpl<StatusTask, StatusTaskDto> {
    public StatusTaskService(StatusTaskMapper mapper, StatusTaskRepository repository) {
        super(mapper, repository);
    }
}

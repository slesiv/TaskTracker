package org.example.services.all;

import org.example.dto.all.HistoryTaskDto;
import org.example.entities.all.HistoryTask;
import org.example.mappers.all.HistoryTaskMapper;
import org.example.repositories.all.HistoryTaskRepository;
import org.example.services.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HistoryTaskService extends AbstractServiceImpl<HistoryTask, HistoryTaskDto> {
    public HistoryTaskService(HistoryTaskMapper mapper, HistoryTaskRepository repository) {
        super(mapper, repository);
    }
}

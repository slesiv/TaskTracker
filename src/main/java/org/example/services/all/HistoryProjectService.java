package org.example.services.all;

import org.example.dto.all.HistoryProjectDto;
import org.example.entities.all.HistoryProject;
import org.example.mappers.all.HistoryProjectMapper;
import org.example.repositories.all.HistoryProjectRepository;
import org.example.services.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HistoryProjectService extends AbstractServiceImpl<HistoryProject, HistoryProjectDto> {
    public HistoryProjectService(HistoryProjectMapper mapper, HistoryProjectRepository repository) {
        super(mapper, repository);
    }
}

package org.example.services.all;

import org.example.dto.all.StatusProjectDto;
import org.example.entities.all.StatusProject;
import org.example.mappers.all.StatusProjectMapper;
import org.example.repositories.all.StatusProjectRepository;
import org.example.services.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class StatusProjectService
        extends AbstractServiceImpl<StatusProject, StatusProjectDto> {

    public StatusProjectService(StatusProjectMapper mapper, StatusProjectRepository repository) {
        super(mapper, repository);
    }
}

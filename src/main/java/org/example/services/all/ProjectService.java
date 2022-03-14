package org.example.services.all;

import org.example.dto.all.ProjectDto;
import org.example.entities.all.Project;
import org.example.mappers.all.ProjectMapper;
import org.example.repositories.all.ProjectRepository;
import org.example.services.CommonServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProjectService extends CommonServiceImpl<Project, ProjectDto> {
    public ProjectService(ProjectMapper mapper, ProjectRepository repository) {
        super(mapper, repository);
    }
}
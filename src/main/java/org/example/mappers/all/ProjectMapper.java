package org.example.mappers.all;

import org.example.dto.all.ProjectDto;
import org.example.entities.all.Project;
import org.example.mappers.EntityMapper;
import org.springframework.stereotype.Component;

@Component
public class ProjectMapper implements EntityMapper<Project, ProjectDto> {

    @Override
    public ProjectDto toDto(Project project) {
        ProjectDto entityDto = new ProjectDto();
        entityDto.setId(project.getId());
        entityDto.setName(project.getName());
        entityDto.setAuthor(project.getAuthor());
        entityDto.setLastHistory(project.getLastChanged());
        return entityDto;
    }

    @Override
    public Project toEntity(ProjectDto pd) {
        Project entity = new Project();
        entity.setName(pd.getName());
        entity.setAuthor(pd.getAuthor());
        entity.setLastChanged(pd.getLastHistory());
        return entity;
    }
}

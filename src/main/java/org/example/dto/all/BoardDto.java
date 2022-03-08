package org.example.dto.all;

import org.example.dto.AbstractIdAndNameDto;
import org.example.entities.all.Project;

public class BoardDto extends AbstractIdAndNameDto {

    private Project project;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}

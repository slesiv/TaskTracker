package org.example.dto.all;

import org.example.dto.AbstractIdDto;
import org.example.entities.all.Project;
import org.example.entities.all.StatusProject;
import org.example.entities.all.User;

import java.time.LocalDateTime;

public class HistoryProjectDto extends AbstractIdDto {

    private LocalDateTime changed;
    private StatusProject status;
    private User user;
    private Project project;

    public LocalDateTime getChanged() {
        return changed;
    }

    public void setChanged(LocalDateTime changed) {
        this.changed = changed;
    }

    public StatusProject getStatus() {
        return status;
    }

    public void setStatus(StatusProject status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}

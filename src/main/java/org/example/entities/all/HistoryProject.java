package org.example.entities.all;

import org.example.entities.AbstractEntity;
import org.example.entities.all.Project;
import org.example.entities.all.StatusProject;
import org.example.entities.all.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "history_projects")
public class HistoryProject extends AbstractEntity {

    @Column(name = "changed")
    private LocalDateTime changed;

    @ManyToOne
    private StatusProject status;

    @ManyToOne
    private User user;

    @ManyToOne
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

package org.example.entities.all;

import org.example.entities.AbstractEntity;
import org.example.entities.all.StatusTask;
import org.example.entities.all.Task;
import org.example.entities.all.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "history_tasks")
public class HistoryTask extends AbstractEntity {

    @Column(name = "changed")
    private LocalDateTime changed;

    @ManyToOne
    private StatusTask status;

    @ManyToOne
    private User user;

    @ManyToOne
    private Task task;

    public LocalDateTime getChanged() {
        return changed;
    }

    public void setChanged(LocalDateTime changed) {
        this.changed = changed;
    }

    public StatusTask getStatus() {
        return status;
    }

    public void setStatus(StatusTask status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}

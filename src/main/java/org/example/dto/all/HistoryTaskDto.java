package org.example.dto.all;

import org.example.dto.AbstractIdDto;
import org.example.entities.all.StatusTask;
import org.example.entities.all.Task;
import org.example.entities.all.User;

import java.time.LocalDateTime;

public class HistoryTaskDto extends AbstractIdDto {

    private LocalDateTime changed;
    private StatusTask status;
    private User user;
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

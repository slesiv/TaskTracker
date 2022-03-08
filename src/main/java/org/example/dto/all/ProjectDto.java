package org.example.dto.all;

import org.example.dto.AbstractIdAndNameDto;
import org.example.entities.all.HistoryProject;
import org.example.entities.all.User;

public class ProjectDto extends AbstractIdAndNameDto {

    private User author;
    private HistoryProject lastHistory;

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public HistoryProject getLastHistory() {
        return lastHistory;
    }

    public void setLastHistory(HistoryProject lastHistory) {
        this.lastHistory = lastHistory;
    }
}

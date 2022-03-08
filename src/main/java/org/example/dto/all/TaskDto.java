package org.example.dto.all;

import org.example.dto.AbstractIdDto;
import org.example.entities.all.Board;
import org.example.entities.all.HistoryTask;
import org.example.entities.all.Release;
import org.example.entities.all.User;

public class TaskDto extends AbstractIdDto {

    private String title;
    private String description;
    private HistoryTask lastChanged;
    private User author;
    private User executor;
    private Release release;
    private Board board;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HistoryTask getLastChanged() {
        return lastChanged;
    }

    public void setLastChanged(HistoryTask lastChanged) {
        this.lastChanged = lastChanged;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public User getExecutor() {
        return executor;
    }

    public void setExecutor(User executor) {
        this.executor = executor;
    }

    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}

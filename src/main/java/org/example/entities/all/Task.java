package org.example.entities.all;

import org.example.entities.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task extends AbstractEntity {

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", columnDefinition = "text", nullable = false)
    private String description;

    @ManyToOne
    private HistoryTask lastChanged;

    @ManyToOne
    private User author;

    @ManyToOne
    private User executor;

    @ManyToOne
    private Release release;

    @ManyToOne
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

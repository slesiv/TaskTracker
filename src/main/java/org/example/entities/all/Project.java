package org.example.entities.all;

import org.example.entities.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "projects")
public class Project extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @ManyToOne
    private User author;

    @ManyToOne
    private HistoryProject lastChanged;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public HistoryProject getLastChanged() {
        return lastChanged;
    }

    public void setLastChanged(HistoryProject lastHistory) {
        this.lastChanged = lastHistory;
    }
}

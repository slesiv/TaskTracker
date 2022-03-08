package org.example.entities.all;

import org.example.entities.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "boards")
public class Board extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @ManyToOne
    private Project project;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
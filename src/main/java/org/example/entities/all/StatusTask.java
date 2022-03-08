package org.example.entities.all;

import org.example.entities.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "status_task")
public class StatusTask extends AbstractEntity {

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

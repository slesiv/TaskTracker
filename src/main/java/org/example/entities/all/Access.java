package org.example.entities.all;

import org.example.entities.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "accesses")
public class Access extends AbstractEntity {

    @ManyToOne
    private Project project;

    @ManyToOne
    private User user;

    @ManyToOne
    private Role role;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

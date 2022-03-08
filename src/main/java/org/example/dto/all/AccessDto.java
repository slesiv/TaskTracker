package org.example.dto.all;

import org.example.dto.AbstractIdDto;
import org.example.entities.all.Project;
import org.example.entities.all.Role;
import org.example.entities.all.User;

public class AccessDto extends AbstractIdDto {

    private Project project;
    private User user;
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

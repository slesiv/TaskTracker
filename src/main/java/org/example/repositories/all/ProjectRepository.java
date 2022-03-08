package org.example.repositories.all;

import org.example.entities.all.Project;
import org.example.repositories.EntityRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends EntityRepository<Project> {
}

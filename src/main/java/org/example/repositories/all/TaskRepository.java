package org.example.repositories.all;

import org.example.entities.all.Task;
import org.example.repositories.EntityRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends EntityRepository<Task> {
}

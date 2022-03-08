package org.example.repositories.all;

import org.example.entities.all.User;
import org.example.repositories.EntityRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends EntityRepository<User> {
}

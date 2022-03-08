package org.example.repositories.all;

import org.example.entities.all.Board;
import org.example.repositories.EntityRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends EntityRepository<Board> {
}

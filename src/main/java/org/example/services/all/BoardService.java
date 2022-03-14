package org.example.services.all;

import org.example.dto.all.BoardDto;
import org.example.entities.all.Board;
import org.example.mappers.all.BoardMapper;
import org.example.repositories.all.BoardRepository;
import org.example.services.CommonServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BoardService extends CommonServiceImpl<Board, BoardDto> {

    public BoardService(BoardMapper mapper, BoardRepository repository) {
        super(mapper, repository);
    }
}

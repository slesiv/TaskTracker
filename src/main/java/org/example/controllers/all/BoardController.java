package org.example.controllers.all;

import org.example.controllers.AbstractController;
import org.example.dto.all.BoardDto;
import org.example.entities.all.Board;
import org.example.services.all.BoardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
public class BoardController extends AbstractController<Board, BoardDto> {
    public BoardController(BoardService service) {
        super(service);
    }
}

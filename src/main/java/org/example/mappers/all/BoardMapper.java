package org.example.mappers.all;

import org.example.dto.all.BoardDto;
import org.example.entities.all.Board;
import org.example.mappers.EntityMapper;
import org.springframework.stereotype.Component;

@Component
public class BoardMapper implements EntityMapper<Board, BoardDto> {
    @Override
    public BoardDto toDto(Board entity) {
        BoardDto bDto = new BoardDto();
        bDto.setId(entity.getId());
        bDto.setName(entity.getName());
        bDto.setProject(entity.getProject());
        return bDto;
    }

    @Override
    public Board toEntity(BoardDto entityDto) {
        Board b = new Board();
        b.setName(entityDto.getName());
        b.setProject(entityDto.getProject());
        return b;
    }
}

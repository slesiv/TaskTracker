package org.example.mappers.all;

import org.example.dto.all.TaskDto;
import org.example.entities.all.Task;
import org.example.mappers.EntityMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper implements EntityMapper<Task, TaskDto> {
    @Override
    public TaskDto toDto(Task entity) {
        TaskDto entityDto = new TaskDto();
        entityDto.setId(entity.getId());
        entityDto.setTitle(entity.getTitle());
        entityDto.setAuthor(entity.getAuthor());
        entityDto.setBoard(entity.getBoard());
        entityDto.setDescription(entity.getDescription());
        entityDto.setExecutor(entity.getExecutor());
        entityDto.setRelease(entity.getRelease());
        entityDto.setLastChanged(entity.getLastChanged());
        return entityDto;
    }

    @Override
    public Task toEntity(TaskDto entityDto) {
        Task entity = new Task();
        entity.setTitle(entityDto.getTitle());
        entity.setAuthor(entityDto.getAuthor());
        entity.setBoard(entityDto.getBoard());
        entity.setDescription(entityDto.getDescription());
        entity.setExecutor(entityDto.getExecutor());
        entity.setRelease(entityDto.getRelease());
        entity.setLastChanged(entityDto.getLastChanged());
        return entity;
    }
}

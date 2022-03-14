package org.example.controllers;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.dto.CommonDto;
import org.example.entities.AbstractEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CommonController<E extends AbstractEntity, DTO extends CommonDto> {

    @PostMapping
    @Tag(name="Create entity", description="To create, pass the data transfer object(DTO) entity in parameter")
    ResponseEntity<DTO> create(@RequestBody @Parameter(description = "DTO entity", required = true) DTO entityDto);

    @DeleteMapping("/{id}")
    @Tag(name="Delete entity", description="To delete, pass the entity in parameter")
    ResponseEntity<String> delete(@PathVariable @Parameter(description = "Entity ID to delete", required = true) Long id);

    @GetMapping
    @Tag(name="Get all entity", description="To get entities, call the method with no parameters")
    ResponseEntity<List<DTO>> findAll();

    @GetMapping("/{id}")
    @Tag(name="Get entity by id", description="To get entity, pass the ID in parameter")
    ResponseEntity<DTO> findById(@PathVariable String id);

    @PutMapping
    @Tag(name="Update entity", description="To update entity, pass the changed entity in parameter")
    ResponseEntity<DTO> update(@RequestBody DTO entityDto);
}
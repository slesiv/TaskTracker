package org.example.mappers.controllers;

import org.example.dto.CommonDto;
import org.example.entities.AbstractEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CommonController<E extends AbstractEntity, DTO extends CommonDto> {

    @PostMapping
    ResponseEntity<DTO> create(@RequestBody DTO entityDto);

    @DeleteMapping("/{id}")
    ResponseEntity<String> delete(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<DTO>> findAll();

    @PutMapping
    ResponseEntity<DTO> update(@RequestBody DTO entityDto);
}
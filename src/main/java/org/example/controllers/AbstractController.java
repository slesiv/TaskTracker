package org.example.controllers;

import org.example.dto.CommonDto;
import org.example.entities.AbstractEntity;
import org.example.services.CommonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public abstract class AbstractController<E extends AbstractEntity, DTO extends CommonDto>
        implements CommonController<E, DTO> {

    private CommonService<E, DTO> service;

    public AbstractController(CommonService<E, DTO> service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<DTO> create(@RequestBody DTO entityDto) {
        return ResponseEntity.ok(service.create(entityDto));
    }

    @Override
    public ResponseEntity<String> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok("Ok.");
    }

    @Override
    public ResponseEntity<List<DTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @Override
    public ResponseEntity<DTO> update(DTO entityDto) {
        return ResponseEntity.ok(service.update(entityDto));
    }
}
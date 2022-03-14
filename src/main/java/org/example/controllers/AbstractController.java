package org.example.controllers;

import org.example.dto.CommonDto;
import org.example.entities.AbstractEntity;
import org.example.services.CommonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public abstract class AbstractController<E extends AbstractEntity, D extends CommonDto>
        implements CommonController<E, D> {

    private CommonService<E, D> service;

    public AbstractController(CommonService<E, D> service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<D> create(@RequestBody D entityDto) {
        return ResponseEntity.ok(service.create(entityDto));
    }

    @Override
    public ResponseEntity<String> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok("Ok.");
    }

    @Override
    public ResponseEntity<List<D>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @Override
    public ResponseEntity<D> findById(String id) {
        Long longId = Long.parseLong(id);
        return ResponseEntity.ok(service.findByID(longId));
    }

    @Override
    public ResponseEntity<D> update(D entityDto) {
        return ResponseEntity.ok(service.update(entityDto));
    }
}
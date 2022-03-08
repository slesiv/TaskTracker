package org.example.mappers.controllers.all;

import org.example.mappers.controllers.AbstractController;
import org.example.dto.all.ReleaseDto;
import org.example.entities.all.Release;
import org.example.services.all.ReleaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/release")
public class ReleaseController extends AbstractController<Release, ReleaseDto> {
    public ReleaseController(ReleaseService service) {
        super(service);
    }
}

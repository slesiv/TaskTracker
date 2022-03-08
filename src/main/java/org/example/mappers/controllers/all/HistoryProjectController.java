package org.example.mappers.controllers.all;

import org.example.mappers.controllers.AbstractController;
import org.example.dto.all.HistoryProjectDto;
import org.example.entities.all.HistoryProject;
import org.example.services.all.HistoryProjectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/historyproject")
public class HistoryProjectController extends AbstractController<HistoryProject, HistoryProjectDto> {
    public HistoryProjectController(HistoryProjectService service) {
        super(service);
    }
}

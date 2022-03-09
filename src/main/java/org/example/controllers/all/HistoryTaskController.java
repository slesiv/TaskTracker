package org.example.controllers.all;

import org.example.controllers.AbstractController;
import org.example.dto.all.HistoryTaskDto;
import org.example.entities.all.HistoryTask;
import org.example.services.all.HistoryTaskService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/historytask")
public class HistoryTaskController extends AbstractController<HistoryTask, HistoryTaskDto> {
    public HistoryTaskController(HistoryTaskService service) {
        super(service);
    }
}

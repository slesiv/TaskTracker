package org.example.dto.all;

import org.example.dto.AbstractIdDto;

import java.time.LocalDateTime;

public class ReleaseDto extends AbstractIdDto {

    private String number;
    private LocalDateTime start;
    private LocalDateTime finish;

    public String getNumber() {
        return number;
    }

    public void setNumber(String numbed) {
        this.number = numbed;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }
}

package org.example.dto;

public abstract class AbstractIdDto implements CommonDto{
    private Long id;

    @Override
    public Long getId() {
        return id;
    }
}

package org.example.dto;

public abstract class AbstractIdAndNameDto extends AbstractIdDto {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

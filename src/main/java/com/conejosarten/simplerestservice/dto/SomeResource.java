package com.conejosarten.simplerestservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SomeResource {

    private final long id;
    private final String someMessage;

    public SomeResource(long id, String message)
    {
        this.id = id;
        this.someMessage = message;
    }
}

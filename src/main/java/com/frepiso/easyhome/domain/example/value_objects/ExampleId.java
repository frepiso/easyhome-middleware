package com.frepiso.easyhome.domain.example.value_objects;

import com.frepiso.easyhome.domain.common.anotations.ValueObject;
import org.springframework.util.Assert;

import java.util.UUID;

@ValueObject
public record ExampleId(UUID id) {

    public ExampleId {
        Assert.notNull(id, "id must not be null");
    }

    public ExampleId() {
        this(UUID.randomUUID());
    }
}

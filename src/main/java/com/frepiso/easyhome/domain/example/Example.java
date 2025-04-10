package com.frepiso.easyhome.domain.example;

import com.frepiso.easyhome.domain.common.anotations.DomainAggregate;
import com.frepiso.easyhome.domain.example.value_objects.ExampleId;

@DomainAggregate
public class Example {

    private ExampleId id;
    private String name;

    public Example(String name) {
        this.id = new ExampleId();
        this.name = name;
    }

    //Getters
    public ExampleId getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}

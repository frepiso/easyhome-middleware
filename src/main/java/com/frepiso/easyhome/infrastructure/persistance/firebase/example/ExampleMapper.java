package com.frepiso.easyhome.infrastructure.persistance.firebase.example;

import com.frepiso.easyhome.domain.example.Example;

public class ExampleMapper {

    public static Example entityToDomain(ExampleEntity exampleEntity) {
        Example example = new Example(exampleEntity.getName());
        return example;
    }

    public static ExampleEntity domainToEntity(Example domain) {
        return new ExampleEntity(domain.getId().id(), domain.getName());
    }
}

package com.frepiso.easyhome.application.example.ports;

import com.frepiso.easyhome.domain.example.Example;
import com.frepiso.easyhome.domain.example.value_objects.ExampleId;

import java.util.List;

public interface ExampleRepository {
    Example save(Example example);
    List<Example> findByExampleId(ExampleId exampleId);
}

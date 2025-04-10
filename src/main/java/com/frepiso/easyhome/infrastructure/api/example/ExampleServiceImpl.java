package com.frepiso.easyhome.infrastructure.api.example;

import com.frepiso.easyhome.application.example.ports.ExampleRepository;
import com.frepiso.easyhome.application.example.ports.ExampleService;
import com.frepiso.easyhome.domain.example.Example;
import com.frepiso.easyhome.domain.example.value_objects.ExampleId;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExampleServiceImpl implements ExampleService {

    private final ExampleRepository exampleRepository;

    @Override
    public Example createExample(Example example) {
        return exampleRepository.save(example);
    }

    @Override
    public List<Example> getExamplesByExampleId(ExampleId exampleId) {
        return exampleRepository.findByExampleId(exampleId);
    }

}

package com.frepiso.easyhome.infrastructure.persistance.firebase.example;

import com.frepiso.easyhome.domain.example.Example;
import com.frepiso.easyhome.application.example.ports.ExampleRepository;
import com.frepiso.easyhome.domain.example.value_objects.ExampleId;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;

import java.util.List;

public class ExampleRepositoryImpl implements ExampleRepository {

    private final Firestore firestore = FirestoreClient.getFirestore();

    @Override
    public Example save(Example example) {
        ExampleEntity exampleEntity = new ExampleEntity(example.getId().id(), example.getName());
        DocumentReference doc = firestore.collection("examples").document();
//        example.setId(doc.getId());
//        doc.set(example);
        return example;
    }

    @Override
    public List<Example> findByExampleId(ExampleId exampleId) {
        // TODO
    }
}

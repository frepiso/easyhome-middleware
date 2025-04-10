package com.frepiso.easyhome.infrastructure.persistance.firebase.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ExampleEntity {
    private UUID id;
    private String name;
}

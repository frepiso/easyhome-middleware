package com.frepiso.easyhome.infrastructure.api.example;

import com.frepiso.easyhome.application.example.ports.ExampleService;
import com.frepiso.easyhome.domain.example.Example;
import com.google.firebase.auth.FirebaseToken;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/examples")
public class ExampleController {

    private final ExampleService exampleService;

    @PostMapping
    public ResponseEntity<Example> createExpense(@RequestBody Example example, @AuthenticationPrincipal FirebaseToken user) {
        return ResponseEntity.ok(exampleService.createExample(example));
    }

    @GetMapping
    public ResponseEntity<List<Example>> getUserExpenses(@AuthenticationPrincipal FirebaseToken user) {
        Example example = new Example("test");
        ResponseEntity.ok(exampleService.createExample(example));
        return ResponseEntity.ok(
                // exampleService.getExamplesByExampleId(user.getUid()) // TODO
                exampleService.getExamplesByExampleId(example.getId())
        );
    }
}

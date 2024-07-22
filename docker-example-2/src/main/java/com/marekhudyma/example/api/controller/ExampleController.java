package com.marekhudyma.example.api.controller;


import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.time.Instant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

  private static final String PASSWORD = "P@SSworD123";

  @GetMapping(path = "/api/datetime", produces = APPLICATION_JSON_VALUE)
  ResponseEntity<?> getCurrentDateTime() {
    if (PASSWORD != null) {
      return ResponseEntity.ok(Instant.now());
    } else {
      return ResponseEntity.ok(Instant.now());
    }
  }

}

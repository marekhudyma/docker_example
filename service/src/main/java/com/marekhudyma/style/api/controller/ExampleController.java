package com.marekhudyma.style.api.controller;


import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.time.Instant;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class ExampleController {

  @GetMapping(path = "/api/datetime", produces = APPLICATION_JSON_VALUE)
  ResponseEntity<?> getCurrentDateTime() {
    return ResponseEntity.ok(Instant.now());
  }

}
package com.marekhudyma.style.api.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ExampleController.class)
public class ExampleControllerTest {

  @Autowired
  private MockMvc mvc;

  @Test
  void shouldGetDatetime() throws Exception {
    mvc.perform(
        get("/api/datetime"))
        .andExpect(status().is(HttpStatus.OK.value()));
  }

}

package com.projectzyx.api.admin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest
@Import({AdminRouter.class, AdminHandler.class})
public class AdminTest {
  private final WebTestClient client;

  @Autowired
  public AdminTest(WebTestClient client) {
    this.client = client;
  }

  @Test
  public void checkHeartbeat() {
    this.client
        .get()
        .uri("/api/heartbeat")
        .accept(MediaType.TEXT_PLAIN)
        .exchange()
        .expectStatus().isOk();
  }
}

package com.projectzyx.api.admin;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class AdminHandler {
  public Mono<ServerResponse> checkHeartbeat(ServerRequest request) {
    return ServerResponse.ok()
        .contentType(MediaType.TEXT_PLAIN)
        .body(BodyInserters.fromValue("It's aliiiive!"));
  }
}

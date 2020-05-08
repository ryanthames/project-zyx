package com.projectzyx.api.admin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class AdminRouter {
  @Bean
  public RouterFunction<ServerResponse> route(AdminHandler adminHandler) {
    return RouterFunctions
        .route(RequestPredicates.GET("/api/heartbeat").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), adminHandler::checkHeartbeat);
  }
}

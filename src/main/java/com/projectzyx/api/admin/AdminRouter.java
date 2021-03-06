package com.projectzyx.api.admin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.TEXT_PLAIN;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class AdminRouter {
  @Bean
  public RouterFunction<ServerResponse> adminRoute(AdminHandler adminHandler) {
    return RouterFunctions.route(GET("/api/admin/heartbeat").and(accept(TEXT_PLAIN)), adminHandler::checkHeartbeat);
  }
}

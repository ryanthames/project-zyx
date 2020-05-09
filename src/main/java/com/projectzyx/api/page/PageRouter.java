package com.projectzyx.api.page;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.TEXT_PLAIN;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class PageRouter {
  @Bean
  public RouterFunction<ServerResponse> pageRoute(PageHandler pageHandler) {
    return RouterFunctions.route(GET("/").and(accept(TEXT_PLAIN)), pageHandler::index);
  }
}
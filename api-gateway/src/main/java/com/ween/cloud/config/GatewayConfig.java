package com.ween.cloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("path_route2",r->r.path("/user/getUserByIds")
                .uri("http://localhost:8201/user/getUserByIds"))
                .build();
    }
}

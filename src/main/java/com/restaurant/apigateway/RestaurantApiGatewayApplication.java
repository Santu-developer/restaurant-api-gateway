package com.restaurant.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * API Gateway main class.
 *
 * Purpose:
 * Acts as the entry point for all client requests.
 *
 * Responsibilities:
 * - Route requests to microservices
 * - Handle load balancing
 * - Provide centralized access
 */

@SpringBootApplication
public class RestaurantApiGatewayApplication {

	public static void main(String[] args) {

        SpringApplication.run(RestaurantApiGatewayApplication.class, args);
        System.out.println("Jay Shree Ram - 3");
	}

}

package com.pragma.payment.infrastructure;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResilienceConfig {
    @Bean
    public CircuitBreakerRegistry circuitBreakerRegistry() {
        return CircuitBreakerRegistry.ofDefaults();
    }

    @Bean
    @CircuitBreaker(name = "paymentService", fallbackMethod = "fallback")
    public String paymentService() {
        // Simulate a service call that might fail
        if (Math.random() < 0.5) {
            throw new RuntimeException("Service call failed");
        }
        return "Service call successful";
    }

    public String fallback(RuntimeException e) {
        return "Fallback response";
    }
}
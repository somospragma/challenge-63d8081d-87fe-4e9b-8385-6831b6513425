package com.pragma.payment.application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@SpringBootTest
class EventServiceTest {
    @Autowired
    private EventService eventService;

    @Test
    void processEvents() {
        Flux<String> events = eventService.processEvents();
        StepVerifier.create(events)
           .expectNext("Event1", "Event2", "Event3")
           .verifyComplete();
    }
}
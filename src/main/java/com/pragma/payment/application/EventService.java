package com.pragma.payment.application;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EventService {
    public Flux<String> processEvents() {
        return Flux.just("Event1", "Event2", "Event3").log();
    }
}
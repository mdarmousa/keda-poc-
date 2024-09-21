package com.mdarmousa.kedapoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Map;

@SpringBootApplication
@RestController
public class KedaPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(KedaPocApplication.class, args);
    }

    @GetMapping("/health")
    public Mono<String> health(){
        return Mono.just("Healthy");
    }

    @GetMapping("count/{count}")
    public Mono<Map<String, String>> count(@PathVariable int count){
        return Mono.just(Map.of("count", String.valueOf(count)))
                .delayElement(Duration.ofSeconds(count));

    }

}

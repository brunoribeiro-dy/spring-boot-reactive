package com.example.demo.web;

import com.example.demo.persistence.entities.Feed;
import com.example.demo.service.DemoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/feeds")
public class DemoController {

    private final DemoService service;

    public DemoController(DemoService service){
        this.service = service;
    }


    @GetMapping("")
    public Flux<Feed> getAll() {
        return service.getAll();
    }


    @GetMapping("/{feedId}")
    public Mono<ResponseEntity<Feed>> getFeed(@PathVariable long feedId) {
        return service
                .getFeed(feedId)
                .map(feed -> new ResponseEntity<>(feed, HttpStatus.OK))
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}

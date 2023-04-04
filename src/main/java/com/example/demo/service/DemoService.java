package com.example.demo.service;

import com.example.demo.persistence.entities.Feed;
import com.example.demo.persistence.repositories.FeedRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DemoService {

    private final FeedRepository feedRepository;

    public DemoService(FeedRepository feedRepository){

        this.feedRepository = feedRepository;
    }
    public Flux<Feed> getAll() {
        return feedRepository.findAll();
    }

    public Mono<Feed> getFeed(long feedId) {
        return feedRepository.findById(feedId);
    }

}

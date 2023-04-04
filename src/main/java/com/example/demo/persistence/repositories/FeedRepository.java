package com.example.demo.persistence.repositories;

import com.example.demo.persistence.entities.Feed;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface FeedRepository extends R2dbcRepository<Feed, Long> {


}
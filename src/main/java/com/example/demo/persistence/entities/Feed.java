package com.example.demo.persistence.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("data_feeds")
@Data
public class Feed {

    @Id
    @Column("id")
    private Long id;
}
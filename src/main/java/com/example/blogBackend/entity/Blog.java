package com.example.blogBackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Blog {
    @Id
    private Long blogId;
    private String title;
    private String description;
}

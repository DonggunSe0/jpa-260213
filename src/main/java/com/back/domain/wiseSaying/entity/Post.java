package com.back.domain.wiseSaying.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private final String title;
    @Column(columnDefinition = "TEXT")
    private final String content ;

    public Post() {
        this.title = "";
        this.content = "";
    }

}
package com.back.domain.wiseSaying.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor // 기본 생성자 만들어줌
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //id를 수정하지 않을것임 DB에서 자동으로 생성되는 값이지만 굳이 final로 선언할 필요는 없음
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content ;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;



    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
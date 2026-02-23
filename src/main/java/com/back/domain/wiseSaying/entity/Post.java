package com.back.domain.wiseSaying.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity //jpa가 비슷한 형태로 테이블 만들어 주려고함
public class WiseSaying {
    @Id //식별자가 있어야 jpa에서 만들어 줄 수 있음
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //int
    private String saying; //varchar(255)
    private String author;  //varchar(255)
} // db에 저장


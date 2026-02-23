package com.back.global;

import com.back.domain.wiseSaying.entity.Post;
import com.back.domain.wiseSaying.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseInitData {

    @Autowired
    private PostRepository postRepository;

    @Bean //앱이 실행되면 딱 한번 실행
    ApplicationRunner initDataRunner() {
        return args -> {
            // 초기 데이터 설정
            postRepository.count(); // select count(*) from post;

            Post post1 = new Post("제목1", "내용1");

            postRepository.save(post1); //jpaRepository에서 jpa가 구현해줌
            // insert into post (title, content) values ("제목1", "내용1");
            postRepository.findById(1); // select * from post where id = 1;


        };
    }

}

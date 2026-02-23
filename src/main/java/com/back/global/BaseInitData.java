package com.back.global;

import com.back.domain.wiseSaying.entity.Post;
import com.back.domain.wiseSaying.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class BaseInitData {

    @Autowired
    private PostService postService;

    @Bean //앱이 실행되면 딱 한번 실행
    ApplicationRunner initDataRunner() {
        return args -> {
            // 초기 데이터 설정
            work1();
            work2();

        };
    }

    void work1(){

        //sample data가 이미 존재하면 초기 데이터를 넣지 않음
        if(postService.getTotalCount() > 0) {
            return;
        }
        //서비스를 도입해서 비즈니스 로직 재사용
        postService.write("제목1", "내용1");
        postService.write("제목2", "내용2");


    };

    void work2(){ //조회
        Optional<Post> opPost = postService.getPost(1);
        // select * from post where id = 1;
    };

}

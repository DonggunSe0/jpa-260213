package com.back.domain.wiseSaying.service;

import com.back.domain.wiseSaying.entity.Post;
import com.back.domain.wiseSaying.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public void write(String title, String content) {

        //예외 처리
//        if(title.length()<10) {
//            throw new IllegalArgumentException("제목은 10자 이상이어야 합니다.");
//        }

        //작성 및 db에 저장하는 로직
        Post post = new Post(title, content);
        postRepository.save(post);

    }
    public Optional<Post> getPost(int id) {
        //id로 post를 조회하는 로직
        return postRepository.findById(id);
    }

    public long getTotalCount() {
        return postRepository.count();
    }

     //생성자 주입

}

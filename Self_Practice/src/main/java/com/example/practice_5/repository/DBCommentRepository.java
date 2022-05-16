package com.example.practice_5.repository;

import com.example.practice_5.model.comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(comment comment) {
        System.out.println("Storing comment : " + comment.getText());
    }
}

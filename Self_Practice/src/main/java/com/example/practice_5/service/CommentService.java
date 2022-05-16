package com.example.practice_5.service;

import com.example.practice_5.model.comment;
import com.example.practice_5.proxy.CommentNotificationProxy;
import com.example.practice_5.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository, @Qualifier("Email") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        System.out.println("Eager inJection");
    }

    private final CommentNotificationProxy commentNotificationProxy;

    public void publishComment(comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);

    }

}

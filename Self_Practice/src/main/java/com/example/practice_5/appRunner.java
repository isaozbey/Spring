package com.example.practice_5;

import com.example.practice_5.config.projectConfig;
import com.example.practice_5.model.comment;
import com.example.practice_5.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class appRunner {

    public static void main(String[] args) {
        comment comment=new comment();
        comment.setAuthor("Okkes");
        comment.setText("  Okkes yazdi bunu");


        ApplicationContext container=new AnnotationConfigApplicationContext(projectConfig.class);

//        CommentService service=container.getBean(CommentService.class);
//        service.publishComment(comment);
    }

}

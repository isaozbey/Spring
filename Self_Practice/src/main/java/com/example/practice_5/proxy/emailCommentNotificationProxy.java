package com.example.practice_5.proxy;

import com.example.practice_5.model.comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Email")
public class emailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(comment comment) {
        System.out.println("Sending email notification for comment:  "+ comment.getText());
    }
}

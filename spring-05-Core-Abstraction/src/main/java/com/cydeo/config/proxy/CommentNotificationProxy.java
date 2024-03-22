package com.cydeo.config.proxy;

import com.cydeo.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}

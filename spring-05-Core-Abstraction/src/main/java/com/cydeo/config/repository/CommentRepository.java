package com.cydeo.config.repository;

import com.cydeo.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}

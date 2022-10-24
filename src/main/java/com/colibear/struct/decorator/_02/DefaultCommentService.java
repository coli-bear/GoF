package com.colibear.struct.decorator._02;

public class DefaultCommentService implements CommentService {
    @Override
    public void addComment(String comment) {
        System.out.println("comment = " + comment);
    }
}

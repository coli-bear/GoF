package com.colibear.struct.decorator._02;

public class Client {
    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }
    public void writeComment(String comment) {
        commentService.addComment(comment);
    }
}

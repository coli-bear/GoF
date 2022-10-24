package com.colibear.struct.decorator._01;

public class TrimmingCommentService extends CommentService{
    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "").trim();
    }
}

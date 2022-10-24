package com.colibear.struct.decorator._01;

public class Client {
    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new CommentService());
        client.writeComment("오징어 게임");
        client.writeComment("존잼...");
    }
}

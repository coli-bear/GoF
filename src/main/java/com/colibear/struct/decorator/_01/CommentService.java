package com.colibear.struct.decorator._01;

import java.util.ArrayList;
import java.util.List;

public class CommentService {
    private List<String> comments = new ArrayList<>();

    public void addComment(String comment) {
        comments.add(comment);
    }
}

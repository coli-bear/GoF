package com.colibear.behavior.chainofresponsibillity._01;

public class RequestHandler {
    public void handle(Request request) {
        System.out.println("request = " + request.getBody());
    }
}

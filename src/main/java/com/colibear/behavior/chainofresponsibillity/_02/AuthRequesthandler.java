package com.colibear.behavior.chainofresponsibillity._02;

import com.colibear.behavior.chainofresponsibillity._01.Request;

public class AuthRequesthandler extends RequestHandler{
    public AuthRequesthandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증 성공했니?????????");
        super.handle(request);
    }
}

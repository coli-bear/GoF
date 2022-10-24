package com.colibear.behavior.chainofresponsibillity._02;

import com.colibear.behavior.chainofresponsibillity._01.Request;

public class LoggingRequestHandler extends RequestHandler{
    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("로깅 해라 ");
        super.handle(request);
    }
}

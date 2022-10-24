package com.colibear.struct.proxy._02.use_interface;

public class DefaultGameService implements GameService{
    @Override
    public void startGame() throws InterruptedException {
        System.out.println("이 자리에 오신 여러분 환영 합니까");
        Thread.sleep(100);
    }
}

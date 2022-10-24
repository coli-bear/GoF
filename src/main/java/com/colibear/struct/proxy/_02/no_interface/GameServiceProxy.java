package com.colibear.struct.proxy._02.no_interface;

import com.colibear.struct.proxy._01.GameService;

public class GameServiceProxy extends GameService {
    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println("(System.currentTimeMillis() - before) = " + (System.currentTimeMillis() - before));
    }
}

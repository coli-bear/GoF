package com.colibear.struct.proxy._02.no_interface;

import com.colibear.struct.proxy._01.GameService;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}

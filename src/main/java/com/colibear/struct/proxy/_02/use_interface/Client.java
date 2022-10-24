package com.colibear.struct.proxy._02.use_interface;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServiceProxy(new DefaultGameService());

        gameService.startGame();

        Client client = new Client();
        client.dynamicProxy();

    }

    private void dynamicProxy() throws InterruptedException {
        GameService gameService = getGameServiceProsy(new DefaultGameService());
        gameService.startGame();
    }

    private GameService getGameServiceProsy(DefaultGameService target) {
        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{GameService.class}, (proxy, method, args) -> {
                    System.out.println("Hello dynamic proxy");
                    method.invoke(target, args);
                    return null;
                });
    }
}

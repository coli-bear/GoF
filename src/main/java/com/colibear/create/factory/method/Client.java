package com.colibear.create.factory.method;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();
        client.priint(new WhiteShipFactory(), "white", "gt@mail.com");

        Ship white = new WhiteShipFactory().orderShip("white", "gt@mail.com");
        Ship black = new BlackShipFactory().orderShip("black", "gt@mail.com");
    }

    private void priint(ShipFactory shipFactory, String name, String email) {

        System.out.println(shipFactory.orderShip(name, email));
    }
}

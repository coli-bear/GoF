package com.colibear.create.factory.method;

public class WhiteShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {

        return new WhiteShip();
    }
}

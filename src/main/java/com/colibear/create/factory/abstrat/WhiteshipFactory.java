package com.colibear.create.factory.abstrat;

import com.colibear.create.factory.method.Ship;
import com.colibear.create.factory.method.WhiteShip;

public class WhiteshipFactory implements DefaultShipFactory {
    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());

        return ship;
    }
}

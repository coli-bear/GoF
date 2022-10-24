package com.colibear.create.factory.abstrat;

import com.colibear.create.factory.method.Ship;
import com.colibear.create.factory.method.ShipFactory;

public interface DefaultShipFactory extends ShipFactory {
    Ship createShip();
}

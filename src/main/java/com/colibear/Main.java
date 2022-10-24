package com.colibear;

import com.colibear.create.factory.abstrat.WhitePartsProFactory;
import com.colibear.create.factory.abstrat.WhiteshipFactory;
import com.colibear.create.factory.method.Ship;
import com.colibear.create.factory.method.ShipFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ShipFactory shipFactory = new WhiteshipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();

        System.out.println("ship.getAnchor().getClass() = " + ship.getAnchor().getClass());
        System.out.println("ship.getWheel().getClass() = " + ship.getWheel().getClass());

    }
}
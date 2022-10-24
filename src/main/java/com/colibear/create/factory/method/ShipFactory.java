package com.colibear.create.factory.method;

public interface ShipFactory {
    default Ship orderShip(String name, String email) {
        validate(name, email);

        prepareFor(name);

        Ship ship = createShip();

        sendEmailTo(email, ship);

        return ship;
    }

    private void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

    Ship createShip();

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Need ship name");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Need email");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }
}

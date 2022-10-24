package com.colibear.create.factory.abstrat;

// 추상 팩토리가 생성됨
public interface ShipPartsFactory {
    Anchor createAnchor();
    Wheel createWheel();
}

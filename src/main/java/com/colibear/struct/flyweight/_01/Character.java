package com.colibear.struct.flyweight._01;

public class Character {
    private String value;
    private String color;
    private String fontFamily;
    private int fontSize;

    public Character(String value, String color, String fontFamily, int fontSize) {
        this.value = value;
        this.color = color;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }
}

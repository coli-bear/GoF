package com.colibear.struct.flyweight._02;

// 변하지 않는것을 분리
// 불변으로 만들어줘야한다., 상속도 막아줘야 한다.
public final class Font {
    private final String fontFamily;
    private final int fontSize;

    public Font(String fontFamily, int fontSize) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }
}

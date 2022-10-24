package com.colibear.behavior.command._01;

public class Button {
    private Light light;

    public Button(Light light) {
        this.light = light;
    }

    public void press() {
        light.on();
    }

    public static void main(String[] args) {
        Button button = new Button(new Light());

        // 이 상황에서 불을 꺼야 하는 경우
        button.press();
        button.press();
        button.press();
        button.press();
        button.press();
        button.press();
        button.press();
    }
}

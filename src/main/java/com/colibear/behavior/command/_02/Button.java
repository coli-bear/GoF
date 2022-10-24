package com.colibear.behavior.command._02;

public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        Button button = new Button(new Command() {
            @Override
            public void execute() {

            }
        });

        button.press();
        button.press();
    }
}

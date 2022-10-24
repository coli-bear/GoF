package com.colibear.struct.pacade._02;

public class Client {
    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("localhost");

        EmailSender emailSender = new EmailSender(emailSettings);

        EmailMessage emailMessage = new EmailMessage();

        emailMessage.setFrom("colibear");
        emailMessage.setTo("colibeaer");
        emailMessage.setTitle("오징어 게임 명대사?");
        emailMessage.setContent("빡은 더 지옥이더라고...");

        emailSender.sendEmail(emailMessage);
    }
}

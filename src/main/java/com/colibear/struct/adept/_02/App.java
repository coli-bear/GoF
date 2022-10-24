package com.colibear.struct.adept._02;

import com.colibear.struct.adept._02.security.LoginHandler;
import com.colibear.struct.adept._02.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("coli-bear", "coli-bear");
        System.out.println("login = " + login);
    }
}

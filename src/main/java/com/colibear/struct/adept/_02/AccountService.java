package com.colibear.struct.adept._02;

public class AccountService {
    public Account findAccountByUsername(String username) {
        return Account.builder()
                .newInstance()
                .username(username)
                .password(username)
                .email(username)
                .getInstance();
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {
        
    }
}

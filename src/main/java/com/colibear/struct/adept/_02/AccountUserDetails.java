package com.colibear.struct.adept._02;

import com.colibear.struct.adept._02.security.UserDetails;

public class AccountUserDetails implements UserDetails {

    Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getUsername();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}

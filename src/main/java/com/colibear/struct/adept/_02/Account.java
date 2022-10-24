package com.colibear.struct.adept._02;

public class Account {
    private String username;
    private String password;
    private String email;

    private Account() {

    }

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static Builder builder() {
        return new Builder();
    }
    static class Builder {
        private Account account;
        public Builder newInstance() {
            this.account = new Account();
            return this;
        }

        public Builder email(String email) {
            account.setEmail(email);
            return this;
        }

        public Builder username(String username) {
            account.setUsername(username);
            return this;
        }

        public Builder password(String password) {
            account.setPassword(password);
            return this;
        }

        public Account getInstance() {
            return account;
        }
    }
}

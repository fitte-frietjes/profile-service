package com.fittefrietjes.profile.models;

import com.fittefrietjes.profile.models.enums.AccountStatus;
import com.fittefrietjes.profile.models.enums.LoginType;

public class Account {

    private int ID;
    private String name;
    private LoginType loginType;
    private String email;
    private Boolean verified;
    private AccountStatus accountStatus;
    private String password;

    public Account(Builder builder) {
        this.ID = builder.ID;
        this.name = builder.name;
        this.loginType = builder.loginType;
        this.email = builder.email;
        this.verified = builder.verified;
        this.accountStatus = builder.accountStatus;
        this.password = builder.password;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getVerified() {
        return verified;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder{
        private int ID;
        private String name;
        private LoginType loginType;
        private String email;
        private Boolean verified;
        private AccountStatus accountStatus;
        private String password;

        public Builder setID(int ID) {
            this.ID = ID;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLoginType(LoginType loginType) {
            this.loginType = loginType;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setVerified(Boolean verified) {
            this.verified = verified;
            return this;
        }

        public Builder setAccountStatus(AccountStatus accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Account build(){
            return new Account(this);
        }

    }

}

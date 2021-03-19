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

    public Account() {
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

    public Account setID(int ID) {
        this.ID = ID;
        return this;
    }

    public Account setName(String name) {
        this.name = name;
        return this;
    }

    public Account setLoginType(LoginType loginType) {
        this.loginType = loginType;
        return this;
    }

    public Account setEmail(String email) {
        this.email = email;
        return this;
    }

    public Account setVerified(Boolean verified) {
        this.verified = verified;
        return this;
    }

    public Account setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }
}

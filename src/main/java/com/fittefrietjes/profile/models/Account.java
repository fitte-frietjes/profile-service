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

    public Account(int ID, String name, LoginType loginType, String email, Boolean verified, AccountStatus accountStatus, String password) {
        this.ID = ID;
        this.name = name;
        this.loginType = loginType;
        this.email = email;
        this.verified = verified;
        this.accountStatus = accountStatus;
        this.password = password;
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

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

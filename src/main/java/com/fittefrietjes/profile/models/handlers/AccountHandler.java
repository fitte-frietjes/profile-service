package com.fittefrietjes.profile.models.handlers;

import com.fittefrietjes.profile.models.Account;
import com.fittefrietjes.profile.models.Profile;
import com.fittefrietjes.profile.models.enums.AccountStatus;
import com.fittefrietjes.profile.models.enums.LoginType;
import com.fittefrietjes.profile.models.interfaces.iAccountHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AccountHandler implements iAccountHandler {

    List<Account> accounts = new ArrayList<>();

    public AccountHandler(){
        accounts.add(new Account(1,"Steve", LoginType.FACEBOOK,"steve@fittefrietjes.com",true, AccountStatus.ACTIVE,"yaddayadda"));
        accounts.add(new Account(2,"Luke", LoginType.FACEBOOK,"luke@fittefrietjes.com",true, AccountStatus.ACTIVE,"yaddayadda"));
        accounts.add(new Account(3,"Leah", LoginType.FACEBOOK,"leah@fittefrietjes.com",true, AccountStatus.ACTIVE,"yaddayadda"));
        accounts.add(new Account(4,"Airiam", LoginType.FACEBOOK,"airiam@fittefrietjes.com",true, AccountStatus.ACTIVE,"yaddayadda"));
        accounts.add(new Account(5,"Etor", LoginType.FACEBOOK,"etor@fittefrietjes.com",true, AccountStatus.ACTIVE,"yaddayadda"));
        accounts.add(new Account(6,"Ezri", LoginType.FACEBOOK,"ezri@fittefrietjes.com",true, AccountStatus.ACTIVE,"yaddayadda"));
        accounts.add(new Account(7,"Damar", LoginType.FACEBOOK,"damar@fittefrietjes.com",true, AccountStatus.ACTIVE,"yaddayadda"));
    }

    @Override
    public Account get(int id) {
        for(Account account : accounts){
            if(account.getID() == id){
                return account;
            }
        }return null;
    }

    @Override
    public List<Account> getAll() {
        return accounts;
    }

    @Override
    public Account create(Account account) {
        account.setID(accounts.size() + 1);
        accounts.add(account);
        return account;
    }

    @Override
    public Account update(Account account) {
        return null;
    }
}

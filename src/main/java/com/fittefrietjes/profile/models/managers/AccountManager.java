package com.fittefrietjes.profile.models.managers;

import com.fittefrietjes.profile.models.Account;
import com.fittefrietjes.profile.models.interfaces.iAccountHandler;

import java.util.List;

public class AccountManager {

    private iAccountHandler profileHandler;

    public AccountManager(iAccountHandler profileHandler) {
        this.profileHandler = profileHandler;
    }

    public Account getById(int id){
        return profileHandler.get(id);
    }

    public List<Account> getAll(){
        return profileHandler.getAll();
    }

    public Account save(Account account) {
        if(account.getID() != 0){
            return profileHandler.update(account);
        }else{
            return profileHandler.create(account);
        }
    }
}

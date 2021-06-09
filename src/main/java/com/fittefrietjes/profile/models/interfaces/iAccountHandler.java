package com.fittefrietjes.profile.models.interfaces;

import com.fittefrietjes.profile.models.Account;
import com.fittefrietjes.profile.models.Profile;

import java.util.List;

public interface iAccountHandler {
    Account get(int id);
    List<Account> getAll();
    Account create(Account account);
    Account update(Account account);
}

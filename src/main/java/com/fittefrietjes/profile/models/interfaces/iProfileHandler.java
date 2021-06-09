package com.fittefrietjes.profile.models.interfaces;

import com.fittefrietjes.profile.models.Account;
import com.fittefrietjes.profile.models.Profile;

public interface iProfileHandler {
    Account saveAccount(Account account);
    Account getAccount(int id);

    Profile saveProfile(Profile profile);
    Profile getProfile(int id);
}

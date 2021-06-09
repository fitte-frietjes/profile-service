package com.fittefrietjes.profile.models.handlers;

import com.fittefrietjes.profile.models.Account;
import com.fittefrietjes.profile.models.Profile;
import com.fittefrietjes.profile.models.enums.AccountStatus;
import com.fittefrietjes.profile.models.enums.LoginType;
import com.fittefrietjes.profile.models.interfaces.iProfileHandler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProfileHandler implements iProfileHandler {

    private List<Profile> profiles =  new ArrayList<>();

    public ProfileHandler() {
        profiles.add(new Profile.Builder()
                .setAccount(new Account(1,"Steve", LoginType.FACEBOOK,"steve@fittefrietjes.com",true, AccountStatus.ACTIVE,"yaddayadda"))
                .setDateOfBirth(new Date())
                .build());
    }

    @Override
    public Profile get(int id) {
        return profiles.get(id);
    }
}

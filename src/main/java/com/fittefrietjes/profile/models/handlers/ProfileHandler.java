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
                .setID(1)
                .setWeight(88)
                .setLength(1.55)
                .setBmi(36)
                .setDesiredWeight(75)
                .build());
        profiles.add(new Profile.Builder()
                .setAccount(new Account(2,"Luke", LoginType.FACEBOOK,"luke@fittefrietjes.com",true, AccountStatus.ACTIVE,"yaddayadda"))
                .setDateOfBirth(new Date())
                .setID(2)
                .setWeight(61)
                .setLength(1.70)
                .setBmi(21)
                .setDesiredWeight(75)
                .build());
        profiles.add(new Profile.Builder()
                .setAccount(new Account(3,"Leah", LoginType.FACEBOOK,"leah@fittefrietjes.com",true, AccountStatus.ACTIVE,"yaddayadda"))
                .setDateOfBirth(new Date())
                .setID(3)
                .setWeight(120)
                .setLength(1.55)
                .setBmi(49)
                .setDesiredWeight(75)
                .build());
    }

    @Override
    public Profile get(int id) {
        for (Profile profile : profiles) {
            if(profile.getID() == id){
                return profile;
            }
        }
        return null;
    }
}

package com.fittefrietjes.profile.models.managers;

import com.fittefrietjes.profile.models.Account;
import com.fittefrietjes.profile.models.Profile;
import com.fittefrietjes.profile.models.Snack;
import com.fittefrietjes.profile.models.enums.AccountStatus;
import com.fittefrietjes.profile.models.enums.LoginType;
import com.fittefrietjes.profile.models.enums.UnitsDistance;
import com.fittefrietjes.profile.models.interfaces.iProfileHandler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class ProfileManager implements iProfileHandler {

    private List<Account> accountList;
    private List<Profile> profileList;

    public ProfileManager() {

        this.accountList = new ArrayList<>();
        this.profileList = new ArrayList<>();

        // Create account
        var account = new Account.Builder()
                .setID(new Random(4200).nextInt())
                .setEmail("test@test.nl")
                .setPassword("abracadabra")
                .build();

        saveAccount(account);

        // Create profile
        var profile = new Profile.Builder()
                .setAccount(account)
                .setID(0)
                .setWeight(70.5)
                .setDesiredWeight(68.0)
                .setBmi(22.0)
                .setLength(180.0)
                .setFavouriteSnack(new Snack())
                .setDateOfBirth(new Date())
                .setUnit(UnitsDistance.KM)
                .build();

        saveProfile(profile);
    }

    @Override
    public Account getAccount(int id) {
        for(Account account : accountList){
            if(account.getID()==id){
                return account;
            }
        }
        return null;
    }

    public Profile getProfile(int id){
        for(Profile profile : profileList){
            if(profile.getID()==id){
                return profile;
            }
        }
        return null;
    }

    @Override
    public Account saveAccount(Account account) {
        this.accountList.add(account);
        return account;
    }

    @Override
    public Profile saveProfile(Profile profile) {
        this.profileList.add(profile);
        return profile;
    }


}

package com.fittefrietjes.profile.controllers;

import com.fittefrietjes.profile.models.Account;
import com.fittefrietjes.profile.models.Profile;
import com.fittefrietjes.profile.models.enums.AccountStatus;
import com.fittefrietjes.profile.models.enums.UnitsDistance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileCtrl {

    @GetMapping("/{ProfileId}")
    public Profile GetProfileById(@PathVariable("ProfileId") int ProfileId) {

        // Create account
        Account account = new Account();
        account.setID(1);
        account.setEmail("test@test.nl");
        account.setAccountStatus(AccountStatus.ACTIVE);

        // Create profile
        Profile profile = new Profile(account);
        profile.setID(ProfileId);
        profile.setWeight(70.5);
        profile.setUnit(UnitsDistance.KM);

        return profile;
    }

}

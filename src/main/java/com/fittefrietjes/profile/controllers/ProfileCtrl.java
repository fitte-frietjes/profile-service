package com.fittefrietjes.profile.controllers;

import com.fittefrietjes.profile.models.Account;
import com.fittefrietjes.profile.models.Profile;
import com.fittefrietjes.profile.models.Snack;
import com.fittefrietjes.profile.models.enums.AccountStatus;
import com.fittefrietjes.profile.models.enums.LoginType;
import com.fittefrietjes.profile.models.enums.UnitsDistance;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class ProfileCtrl {

    @Operation(summary = "Get profile by ID")
    @GetMapping("/{ProfileId}")
    public Profile GetProfileById(@PathVariable("ProfileId") int ProfileId) {

        // Create account
        var account = new Account.Builder()
                .setID(ProfileId)
                .setName("Test Account")
                .setEmail("test@test.nl")
                .setAccountStatus(AccountStatus.ACTIVE)
                .setLoginType(LoginType.FACEBOOK)
                .build();

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

        return profile;
    }

}

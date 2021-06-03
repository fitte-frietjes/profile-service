package com.fittefrietjes.profile.controllers;

import com.fittefrietjes.profile.models.Profile;
import com.fittefrietjes.profile.models.enums.AccountStatus;
import com.fittefrietjes.profile.models.enums.LoginType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfileCtrlTest {

    /* Unit Test for Profile Controller
    * This UT does not use REST templating or calls to external microservices
    * */

    @Test
    void getProfileById() {
        //Assign
        ProfileCtrl controller = new ProfileCtrl();
        var profileId = 0;

        //Act
        Profile response = controller.GetProfileById(profileId);

        //Assert
        assertEquals("Test Account", response.getAccount().getName());
        assertEquals(LoginType.FACEBOOK, response.getAccount().getLoginType());
        assertEquals(AccountStatus.ACTIVE, response.getAccount().getAccountStatus());
        assertEquals(profileId, response.getID());
    }
}
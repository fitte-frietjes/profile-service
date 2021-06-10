package com.fittefrietjes.profile.unitTests;

import com.fittefrietjes.profile.models.Profile;
import com.fittefrietjes.profile.models.handlers.ProfileHandler;
import com.fittefrietjes.profile.models.managers.ProfileManager;
import com.netflix.discovery.converters.Auto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ProfileCtrlTest {

    @Autowired
    private ProfileHandler profileHandler = new ProfileHandler();

    @Autowired
    private ProfileManager profileManager;

    @Test
    void getProfileById() {
        //Assign
        profileManager = new ProfileManager(profileHandler);

        //Act
        Profile profile = profileManager.getById(1);

        //Assert
        assertEquals(1, profile.getID());
    }
}
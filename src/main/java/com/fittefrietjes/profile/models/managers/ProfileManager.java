package com.fittefrietjes.profile.models.managers;

import com.fittefrietjes.profile.models.Profile;
import com.fittefrietjes.profile.models.interfaces.iProfileHandler;

public class ProfileManager {

    private iProfileHandler profileHandler;

    public ProfileManager(iProfileHandler profileHandler) {
        this.profileHandler = profileHandler;
    }

    public Profile getById(int id){
        return profileHandler.get(id);
    }
}

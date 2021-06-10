package com.fittefrietjes.profile.integrationTests;

import com.fittefrietjes.profile.models.Profile;
import com.fittefrietjes.profile.models.managers.AccountManager;
import com.fittefrietjes.profile.controllers.ProfileCtrl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ProfileCtrl.class)
public class ProfileCtrlIntegrationTest {

    /**
     * Integration Tests will be run from Postman
     *
     * The following tests are executed:
     * 1. Health Check
     * 2. Get all users
     * 3. Register a user
     * 4. Register a user should fail
     * 5. Get a specific user
     * 6. Get a specific user should fail
     *
     * All tests are run simultaneously
     *
     * For the env file used in Postman, please check https://github.com/fitte-frietjes/profile-service
     */

//    @MockBean
//    private AccountManager manager;
//
//    @Autowired
//    private MockMvc mvc;
//
//    private Profile profile;
//
//    @BeforeEach
//    void setup() {
//        profile = new Profile.Builder()
//                .setID(1)
//                .setDateOfBirth(new Date())
//                .build();
//    }
//    @Test
//    void getProfileById_ForUnknownId_ShouldReturn_NotFound() {
//
//    }
//
//    @Test
//    void getProfileById_ForKnownId_ShouldReturn_Profile() throws Exception {
//        // Assign
//        Mockito.when(manager.getProfile(1)).thenReturn(profile);
//
//        System.out.println(profile.getAccount());
//
//        //Assert
//        mvc.perform(get("/1"))
//                .andExpect(status().isOk());
//    }
}

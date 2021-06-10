package com.fittefrietjes.profile.unitTests;

import com.fittefrietjes.profile.models.Account;
import com.fittefrietjes.profile.models.Profile;
import com.fittefrietjes.profile.models.enums.AccountStatus;
import com.fittefrietjes.profile.models.enums.LoginType;
import com.fittefrietjes.profile.models.handlers.AccountHandler;
import com.fittefrietjes.profile.models.handlers.ProfileHandler;
import com.fittefrietjes.profile.models.managers.AccountManager;
import com.fittefrietjes.profile.models.managers.ProfileManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProfileCtrlTest {

    @Autowired
    private ProfileHandler profileHandler = new ProfileHandler();

    @Autowired
    private AccountHandler accountHandler = new AccountHandler();

    @Autowired
    private ProfileManager profileManager;

    @Autowired
    private AccountManager accountManager;

    @Test
    void getProfileById() {
        //Assign
        profileManager = new ProfileManager(profileHandler);
        int id = 1;

        //Act
        Profile profile = profileManager.getById(id);

        //Assert
        assertEquals(id, profile.getID());
    }

    @Test
    void getProfileById_Should_Fail_BecauseProfileDoesNotExist() {
        //Assign
        profileManager = new ProfileManager(profileHandler);
        int id = 0; // this ID does not exist;

        //Act
        Profile profile = profileManager.getById(id);

        //Assert
        assertEquals(null, profile);
    }

    @Test
    void getAccountById(){
        //Assign
        accountManager = new AccountManager(accountHandler);
        int id = 1;

        //Act
        Account account = accountManager.getById(id);

        //Assert
        assertEquals(account.getID(), id);
    }

    @Test
    void getAccountById_Should_Fail_BecauseAccountDoesNotExit(){
        //Assign
        accountManager = new AccountManager(accountHandler);
        int id = 0;

        //Act
        Account account = accountManager.getById(0);

        //Assert
        assertEquals(null, account);
    }

    @Test
    void getAllAccounts(){
        //Assign
        accountManager = new AccountManager(accountHandler);

        //Act
        List<Account> accounts = accountHandler.getAll();

        //Assert
        assertNotNull(accounts);
    }

    @Test
    void registerNewAccount(){
        //Assign
        accountManager = new AccountManager(accountHandler);
        var date = new Date();
        var account = new Account(0,"Test", LoginType.FACEBOOK,"test."+date.toString()+"@fittefrietjes.com",true, AccountStatus.ACTIVE,"test");

        //Act
        Account saved = accountManager.save(account);

        //Assert
        assertEquals(true, saved.getID() > 0); // this means an ID has been created for the registered user
        assertEquals("Test", saved.getName());

        //test mag maar falen op 1 reden
    }
}
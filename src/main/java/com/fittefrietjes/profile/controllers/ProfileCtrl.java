package com.fittefrietjes.profile.controllers;

import com.fittefrietjes.profile.models.Account;
import com.fittefrietjes.profile.models.managers.ProfileManager;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class ProfileCtrl {

    @Autowired
    ProfileManager manager;

    @Operation(summary = "Get profile by ID")
    @GetMapping("/{ProfileId}")
    public ResponseEntity GetProfileById(@PathVariable("ProfileId") int id) {

        var profile = manager.getProfile(id);

        return ResponseEntity.ok(profile);
    }

    @Operation(summary = "Get account by ID")
    @GetMapping("/user/{AccountId}")
    public ResponseEntity GetAccountById(@PathVariable("AccountId") int id) {

        var account = manager.getAccount(id);

        return ResponseEntity.ok(account);
    }

    @Operation(summary = "Post a account object",
            description = "Save a new account object ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Post successful",
                    content = {@Content(mediaType = "application/json")}
            ),
            @ApiResponse(responseCode = "500",
                    description = "Error while registering new account",
                    content = {@Content}
            ),
    })
    @PostMapping("/users/register/")
    public ResponseEntity SaveAccount(@RequestBody Account account) {
        var savedAccount =  manager.saveAccount(account);
        return ResponseEntity.ok(savedAccount);
    }
}

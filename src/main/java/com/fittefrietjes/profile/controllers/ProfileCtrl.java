package com.fittefrietjes.profile.controllers;

import com.fittefrietjes.profile.models.Account;
import com.fittefrietjes.profile.models.ErrorMessage;
import com.fittefrietjes.profile.models.managers.AccountManager;
import com.fittefrietjes.profile.models.managers.ProfileManager;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class ProfileCtrl {

    @Autowired
    AccountManager accountManager;

    @Autowired
    ProfileManager profileManager;

    @Operation(summary = "Get health check")
    @GetMapping("")
    public ResponseEntity GetHealthCheck() {
        return ResponseEntity.ok("{ 'STATUS': Good to go! }");
    }

    @Operation(summary = "Get profile by ID")
    @GetMapping("/{ProfileId}")
    public ResponseEntity GetProfileById(@PathVariable("ProfileId") int id) {

        var profile = profileManager.getById(id);

        if(profile == null){

            return new ResponseEntity<String>(
                    new ErrorMessage(400, "This profile does not exist.").toString(),
                    HttpStatus.BAD_REQUEST);
        }

        return ResponseEntity.ok(profile);
    }

    @Operation(summary = "Get account by ID")
    @GetMapping("/users/all")
    public ResponseEntity GetAllAccounts() {

        var accounts = accountManager.getAll();

        return ResponseEntity.ok(accounts);
    }

    @Operation(summary = "Get account by ID")
    @GetMapping("/users/{AccountId}")
    public ResponseEntity GetAccountById(@PathVariable("AccountId") int id) {

        var account = accountManager.getById(id);

        if(account == null){

            return new ResponseEntity<String>(
                    new ErrorMessage(400, "This user does not exist.").toString(),
                    HttpStatus.BAD_REQUEST);
        }

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
    @RequestMapping(method = RequestMethod.POST, value ="/users/register")
    public ResponseEntity SaveAccount(@RequestBody Account account) {
        var savedAccount =  accountManager.save(account);

        if(savedAccount == null){

            return new ResponseEntity<String>(
                    new ErrorMessage(400, "This email address already exists.").toString(),
                    HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(savedAccount);
    }
}

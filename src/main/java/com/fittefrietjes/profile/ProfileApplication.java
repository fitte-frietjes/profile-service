package com.fittefrietjes.profile;

import com.fittefrietjes.profile.models.handlers.AccountHandler;
import com.fittefrietjes.profile.models.handlers.ProfileHandler;
import com.fittefrietjes.profile.models.managers.AccountManager;
import com.fittefrietjes.profile.models.managers.ProfileManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ProfileApplication {

	private AccountHandler accountHandler = new AccountHandler();

	private ProfileHandler profileHandler = new ProfileHandler();

	@Bean
	public AccountManager accountManager(){
		return new AccountManager(accountHandler);
	}

	@Bean
	public ProfileManager profileManager() { return new ProfileManager(profileHandler); }

	public static void main(String[] args) {
		SpringApplication.run(ProfileApplication.class, args);

	}

}

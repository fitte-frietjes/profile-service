package com.fittefrietjes.profile;

import com.fittefrietjes.profile.models.managers.ProfileManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ProfileApplication {

	@Bean
	public ProfileManager profileManager(){
		return new ProfileManager();
	}

	public static void main(String[] args) {
		SpringApplication.run(ProfileApplication.class, args);

	}

}

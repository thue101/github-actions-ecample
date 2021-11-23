package com.thulani.githubcicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCiCdActionsApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome To Github Actions Example.../.. This is an updated version";

    }

    public static void main(String[] args) {
        SpringApplication.run(GithubCiCdActionsApplication.class, args);
    }

}

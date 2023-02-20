/*
 * (c) 2023 T-Systems RUS, Assurance
 * TSO Process Test
 * petApp
 * Created by: A200091050 at 2/14/2023
 */
package com.kulabuha.petApp.config;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    Faker createFaker() {
        return new Faker();
    };
}

/*
 * (c) 2023 T-Systems RUS, Assurance
 * TSO Process Test
 * petApp
 * Created by: A200091050 at 2/7/2023
 */
package com.kulabuha.petApp.services;

import com.github.javafaker.Faker;
import com.kulabuha.petApp.services.interfaces.GeneratorNames;
import org.springframework.stereotype.Service;

@Service
public class GeneratorNamesImpl implements GeneratorNames {

    Faker faker;

    GeneratorNamesImpl(Faker faker) {
        this.faker = faker;
    }

    @Override
    public String generate() {
        return faker.name().firstName();
    }

    @Override
    public String generate(String type, String breed, String sex, String nature) {
        return type + "-" + breed + "-" + sex + "-" + nature;
    }
}

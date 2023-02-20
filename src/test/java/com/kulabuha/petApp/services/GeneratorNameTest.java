/*
 * (c) 2023 T-Systems RUS, Assurance
 * TSO Process Test
 * petApp
 * Created by: A200091050 at 2/7/2023
 */
package com.kulabuha.petApp.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@DisplayName("Service Generator names test set")
public class GeneratorNameTest {

    GeneratorNamesImpl getGeneratorNamesImpl;
    @Autowired
    GeneratorNameTest(GeneratorNamesImpl getGeneratorNamesImpl) {this.getGeneratorNamesImpl = getGeneratorNamesImpl;}

    @Test
    @DisplayName("Generate name")
    void generateName() {
        assertTrue(getGeneratorNamesImpl.generate().matches("[A-Za-z'() 0-9-]+"));
    }
}

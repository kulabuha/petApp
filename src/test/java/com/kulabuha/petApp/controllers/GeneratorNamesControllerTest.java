/*
 * (c) 2023 T-Systems RUS, Assurance
 * TSO Process Test
 * petApp
 * Created by: A200091050 at 2/11/2023
 */
package com.kulabuha.petApp.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
@DisplayName("Controller Generator names test set")
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class GeneratorNamesControllerTest {

    @Autowired
    MockMvc mockMvc;

    @DisplayName("Generate dog-pooch-male-angry name")
    @Test
    public void generateNameTest() throws Exception {
        String responseGeneratedName = this.mockMvc.perform(get("/api/v1/generate")).andDo(System.out::println).andReturn().getResponse().getContentAsString();
        assertTrue(responseGeneratedName.matches("[A-Za-z'() 0-9-]+"));
    }

}


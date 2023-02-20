/*
 * (c) 2023 T-Systems RUS, Assurance
 * TSO Process Test
 * petApp
 * Created by: A200091050 at 2/9/2023
 */
package com.kulabuha.petApp.controllers.rest;

import com.kulabuha.petApp.services.interfaces.GeneratorNames;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class GeneratorNamesController {

    private final GeneratorNames generatorNames  ;

    public GeneratorNamesController(GeneratorNames generatorNames) {
        this.generatorNames = generatorNames;
    }


    @GetMapping(value = {"/generate"})
    public String generate() {
        return generatorNames.generate();
    }
}

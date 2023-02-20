/*
 * (c) 2023 T-Systems RUS, Assurance
 * TSO Process Test
 * petApp
 * Created by: A200091050 at 2/9/2023
 */
package com.kulabuha.petApp.services.interfaces;

public interface GeneratorNames {

    String generate();
    String generate(String type,  String breed, String sex, String nature);
}

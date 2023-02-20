/*
 * (c) 2023 T-Systems RUS, Assurance
 * TSO Process Test
 * petApp
 * Created by: A200091050 at 2/20/2023
 */
package com.kulabuha.petApp.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tags")
public class TagName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tagName;

}

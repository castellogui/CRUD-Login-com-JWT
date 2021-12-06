package com.skipol.umreal.dto;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class UserDTO {

    private Long id;
    private String login;
    private String password;
    private String name;
    private String last_name;
    private String date_birth;
    private String gender;
    private String zip_code;
    private String adress;
    private String city;
    private String state;
    private String country;
    private String type;

}

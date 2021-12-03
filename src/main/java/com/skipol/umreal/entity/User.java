package com.skipol.umreal.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name="user_info")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String last_name;

    @Column
    private String email;

    @Column
    private String date_birth;

    @Column
    private String gender;

    @Column
    private String zip_code;

    @Column
    private String adress;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private String country;

    @Column
    private String type;

}

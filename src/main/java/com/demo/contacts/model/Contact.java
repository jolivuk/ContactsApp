package com.demo.contacts.model;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.Date;
import java.util.UUID;
@Data
@Builder
@Getter

public class Contact {
    private UUID id;
    private String name;
    private String surname;
    private Date birthdate;
    private String address;
    private String email;

}

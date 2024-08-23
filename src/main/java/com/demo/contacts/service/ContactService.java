package com.demo.contacts.service;

import com.demo.contacts.model.Contact;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ContactService {

    public Contact getContact() {
        return Contact.builder()
                .id(UUID.randomUUID())
                .name("steve")
                .email("steve@example.com")
                .build();
    }
}

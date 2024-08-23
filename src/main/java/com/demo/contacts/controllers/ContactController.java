package com.demo.contacts.controllers;

import com.demo.contacts.model.Contact;
import com.demo.contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static com.demo.contacts.model.Contact.*;

@RestController
@RequestMapping("/contact")
public class ContactController {


    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService){
        this.contactService = contactService;
    }

    @GetMapping(value = "/")
    public ResponseEntity<Contact> getRandomContact() {
        Contact contact = contactService.getContact();
        return ResponseEntity.ok(contact);
    }

}

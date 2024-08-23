package com.demo.contacts.repository;

import com.demo.contacts.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class InMemoryContactRepository implements ContactRepository{

    private List<Contact> contactList;

    @Override
    public boolean createContact(Contact contact) {
        return contactList.add(contact);
    }

    @Override
    public Contact readContactByID(UUID id) {
        return contactList.stream()
                .map(E -> E.getId(),E);
    }

    @Override
    public List readAllContact() {
        return List.of();
    }

    @Override
    public boolean updateContact(Contact contact) {
        return false;
    }

    @Override
    public boolean deleteContact(UUID id) {
        return false;
    }
}

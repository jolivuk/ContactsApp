package com.demo.contacts.repository;

import com.demo.contacts.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class InMemoryContactRepository implements ContactRepository{

    private List<Contact> contactList;

    @Override
    public boolean createContact(Contact contact) {
        return contactList.add(contact);
    }

    @Override
    public Optional<Contact> readContactByID(UUID id) {
        return Optional.of(contactList.stream()
                .filter(obj -> obj.getId() == id)
                .findFirst().get());
    }

    @Override
    public List<Contact> readAllContact() {
        return new ArrayList<>(contactList);
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

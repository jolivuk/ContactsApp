package com.demo.contacts.repository;

import com.demo.contacts.model.Contact;

import java.util.List;
import java.util.UUID;

public interface ContactRepository <T extends Contact> {
    public boolean createContact(T contact);
    public T readContactByID(UUID id);
    public List<T> readAllContact();
    public boolean updateContact(T contact);
    public boolean deleteContact(UUID id);
}


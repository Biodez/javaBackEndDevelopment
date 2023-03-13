package com.ltp.contacts.service;

import java.util.List;

import com.ltp.contacts.exception.NoContactException;
import com.ltp.contacts.pojo.Contact;

public interface ContactService {
    Contact getContactById(String id);
    void addContact(Contact contact);
    void updateContactById(String id, Contact contact);
    void deleteContactById(String Id);
    List<Contact> getAllContacts();
}

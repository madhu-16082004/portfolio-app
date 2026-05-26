package com.example.Portfolio1.service;

import com.example.Portfolio1.entity.Contact;
import com.example.Portfolio1.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository repository;

    public Contact save(Contact contact) {
        return repository.save(contact);
    }
}
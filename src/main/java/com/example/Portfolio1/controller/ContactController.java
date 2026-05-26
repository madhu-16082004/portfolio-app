package com.example.Portfolio1.controller;

import com.example.Portfolio1.entity.Contact;
import com.example.Portfolio1.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactService service;

    @PostMapping(value = "/contact", consumes = "application/json", produces = "application/json")
    public String saveContact(@RequestBody Contact contact) {

        System.out.println("NAME => " + contact.getName());
        System.out.println("EMAIL => " + contact.getEmail());
        System.out.println("MESSAGE => " + contact.getMessage());

        service.save(contact);

        return "Saved Successfully";
    }
}
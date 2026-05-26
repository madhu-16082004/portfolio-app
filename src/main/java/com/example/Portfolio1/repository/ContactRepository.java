package com.example.Portfolio1.repository;

import com.example.Portfolio1.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
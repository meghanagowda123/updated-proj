package com.cts.emart.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.emart.beans.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}

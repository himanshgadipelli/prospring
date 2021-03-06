package com.apress.prospring4.ch6;

import java.util.List;

/**
 * Created by bobby on 4/9/2017.
 */
public interface ContactDao {
    List<Contact> findAll();
    List<Contact> findByFirstName(String firstName);
    String findLastNameById(Long id);
    String findFirstNameById(Long id);
    void insert(Contact contact);
    void update(Contact contact);
    void delete(Long contactId);
}

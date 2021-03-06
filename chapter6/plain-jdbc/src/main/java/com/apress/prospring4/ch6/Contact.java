package com.apress.prospring4.ch6;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by bobby on 4/9/2017.
 */
public class Contact implements Serializable{
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString(){
        return "Contact - Id: " + id + ", First name: " + firstName + ", Last name: " + lastName
                + ", Birthday: " + birthDate;
    }
}

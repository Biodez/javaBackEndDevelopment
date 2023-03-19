package com.ltp.contacts.pojo;

import java.util.UUID;

import javax.validation.constraints.NotBlank;

public class Contact {

    private String id;

    @NotBlank(message = "name cannot be blank")
    private String name;
    @NotBlank(message = "phone number cannot be blank")
    private String phoneNumber;


     public Contact(String id, String name, String phoneNumber) {
         this.id = id;
         this.name = name;
         this.phoneNumber = phoneNumber;
     }

    public Contact() {
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

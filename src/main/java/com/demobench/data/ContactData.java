package com.demobench.data;

import com.demobench.model.Contact;

public class ContactData {

    public static Contact createTestContact1() {
        Contact contact = new Contact();
        contact.setEmail("john.doe@example.com");
        contact.setPhone("123-456-7890");
        return contact;
    }

    public static Contact createTestContact2() {
        Contact contact = new Contact();
        contact.setEmail("jane.smith@example.com");
        contact.setPhone("987-654-3210");
        return contact;
    }

    public static Contact createTestContact3() {
        Contact contact = new Contact();
        contact.setEmail("alice.brown@example.com");
        contact.setPhone("555-123-4567");
        return contact;
    }

    public static Contact createTestContact4() {
        Contact contact = new Contact();
        contact.setEmail("bob.white@example.com");
        contact.setPhone("555-987-6543");
        return contact;
    }

    public static Contact createTestContact5() {
        Contact contact = new Contact();
        contact.setEmail("charlie.green@example.com");
        contact.setPhone("555-456-7890");
        return contact;
    }

    public  static  Contact[] createTestContacts() {
        Contact[] contacts = new Contact[5];
        contacts[0] = createTestContact1();
        contacts[1] = createTestContact2();
        contacts[2] = createTestContact3();
        contacts[3] = createTestContact4();
        contacts[4] = createTestContact5();
        return contacts;
    }

}
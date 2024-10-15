package com.demobench.data;

import com.demobench.model.*;

public class CustomerData {

    public static Customer createTestCustomer1() {
        Name name = NameData.createTestName1();
        Address address = AddressData.createTestAddress1();
        Contact contact = ContactData.createTestContact1();
        return new Customer(1, name, contact, address);
    }

    public static Customer createTestCustomer2() {
        Name name = NameData.createTestName2();
        Address address = AddressData.createTestAddress2();
        Contact contact = ContactData.createTestContact2();
        return new Customer(2, name, contact, address);
    }

    public static Customer createTestCustomer3() {
        Name name = NameData.createTestName3();
        Address address = AddressData.createTestAddress3();
        Contact contact = ContactData.createTestContact3();
        return new Customer(3, name, contact, address);
    }

    public static Customer createTestCustomer4() {
        Name name = NameData.createTestName4();
        Address address = AddressData.createTestAddress4();
        Contact contact = ContactData.createTestContact4();
        return new Customer(4, name, contact, address);
    }

    public static Customer createTestCustomer5() {
        Name name = NameData.createTestName5();
        Address address = AddressData.createTestAddress5();
        Contact contact = ContactData.createTestContact5();
        return new Customer(5, name, contact, address);
    }

    public static Customer[] createTestCustomers() {
        Customer[] customers = new Customer[5];
        customers[0] = createTestCustomer1();
        customers[1] = createTestCustomer2();
        customers[2] = createTestCustomer3();
        customers[3] = createTestCustomer4();
        customers[4] = createTestCustomer5();
        return customers;
    }
}
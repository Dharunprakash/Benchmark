package com.demobench.data;

import com.demobench.model.Address;

public class AddressData {

    public static Address createTestAddress1() {
        Address address = new Address();
        address.setStreet("123 Main St");
        address.setCity("Springfield");
        address.setState("IL");
        address.setZip("62701");
        address.setCountry("USA");
        return address;
    }

    public static Address createTestAddress2() {
        Address address = new Address();
        address.setStreet("456 Oak St");
        address.setCity("Chicago");
        address.setState("IL");
        address.setZip("60605");
        address.setCountry("USA");
        return address;
    }

    public static Address createTestAddress3() {
        Address address = new Address();
        address.setStreet("789 Pine St");
        address.setCity("Los Angeles");
        address.setState("CA");
        address.setZip("90001");
        address.setCountry("USA");
        return address;
    }

    public static Address createTestAddress4() {
        Address address = new Address();
        address.setStreet("101 Maple St");
        address.setCity("New York");
        address.setState("NY");
        address.setZip("10001");
        address.setCountry("USA");
        return address;
    }

    public static Address createTestAddress5() {
        Address address = new Address();
        address.setStreet("202 Birch St");
        address.setCity("San Francisco");
        address.setState("CA");
        address.setZip("94101");
        address.setCountry("USA");
        return address;
    }

    public  static  Address[] createTestAddresses() {
        Address[] addresses = new Address[5];
        addresses[0] = createTestAddress1();
        addresses[1] = createTestAddress2();
        addresses[2] = createTestAddress3();
        addresses[3] = createTestAddress4();
        addresses[4] = createTestAddress5();
        return addresses;
    }
}
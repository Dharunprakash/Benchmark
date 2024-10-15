package com.demobench.data;

import com.demobench.model.Name;

import java.util.ArrayList;
import java.util.List;

public class NameData {

    public static Name createTestName1() {
        Name name = new Name();
        name.setFirstName("John");
        name.setLastName("Doe");
        return name;
    }
    public  static Name createTestName2() {
        Name name = new Name();
        name.setFirstName("Jane");
        name.setLastName("Smith");
        return name;
    }

    public  static Name createTestName3() {
        Name name = new Name();
        name.setFirstName("Alice");
        name.setLastName("Brown");
        return name;
    }

    public  static Name createTestName4() {
        Name name = new Name();
        name.setFirstName("Bob");
        name.setLastName("White");
        return name;
    }

    public  static Name createTestName5() {
        Name name = new Name();
        name.setFirstName("Charlie");
        name.setLastName("Green");
        return name;
    }

    public  static List<Name> createTestNames() {
        List<Name> names = new ArrayList<>();
        names.add(createTestName1());
        names.add(createTestName2());
        names.add(createTestName3());
        names.add(createTestName4());
        names.add(createTestName5());
        return names;
    }

}

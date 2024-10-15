package com.demobench.jsondata;

public class ContactData {

    public static String createTestContact1() {
        return "{\"email\":\"john.doe@example.com\",\"phone\":\"123-456-7890\"}";
    }

    public static String createTestContact2() {
        return "{\"email\":\"jane.smith@example.com\",\"phone\":\"987-654-3210\"}";
    }

    public static String createTestContact3() {
        return "{\"email\":\"alice.brown@example.com\",\"phone\":\"555-123-4567\"}";
    }

    public static String createTestContact4() {
        return "{\"email\":\"bob.white@example.com\",\"phone\":\"555-987-6543\"}";
    }

    public static String createTestContact5() {
        return "{\"email\":\"charlie.green@example.com\",\"phone\":\"555-456-7890\"}";
    }

    public static String createTestContacts() {
        return """
                [
                    {"email":"john.doe@example.com","phone":"123-456-7890"},
                    {"email":"jane.smith@example.com","phone":"987-654-3210"},
                    {"email":"alice.brown@example.com","phone":"555-123-4567"},
                    {"email":"bob.white@example.com","phone":"555-987-6543"},
                    {"email":"charlie.green@example.com","phone":"555-456-7890"}
                ]
                """;
    }
}
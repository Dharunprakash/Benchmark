package com.demobench.jsondata;

public class CustomerData {

    public static String createTestCustomer1() {
        return """
                {
                    "customerId": 1,
                    "name": {"firstName":"John","lastName":"Doe"},
                    "contact": {"email":"john.doe@example.com","phone":"123-456-7890"},
                    "address": {"street":"123 Main St","city":"Springfield","state":"IL","zip":"62701","country":"USA"}
                }
                """;
    }

    public static String createTestCustomer2() {
        return """
                {
                    "customerId": 2,
                    "name": {"firstName":"Jane","lastName":"Smith"},
                    "contact": {"email":"jane.smith@example.com","phone":"987-654-3210"},
                    "address": {"street":"456 Oak St","city":"Chicago","state":"IL","zip":"60605","country":"USA"}
                }
                """;
    }

    public static String createTestCustomer3() {
        return """
                {
                    "customerId": 3,
                    "name": {"firstName":"Alice","lastName":"Brown"},
                    "contact": {"email":"alice.brown@example.com","phone":"555-123-4567"},
                    "address": {"street":"789 Pine St","city":"Los Angeles","state":"CA","zip":"90001","country":"USA"}
                }
                """;
    }

    public static String createTestCustomer4() {
        return """
                {
                    "customerId": 4,
                    "name": {"firstName":"Bob","lastName":"White"},
                    "contact": {"email":"bob.white@example.com","phone":"555-987-6543"},
                    "address": {"street":"101 Maple St","city":"New York","state":"NY","zip":"10001","country":"USA"}
                }
                """;
    }

    public static String createTestCustomer5() {
        return """
                {
                    "customerId": 5,
                    "name": {"firstName":"Charlie","lastName":"Green"},
                    "contact": {"email":"charlie.green@example.com","phone":"555-456-7890"},
                    "address": {"street":"202 Birch St","city":"San Francisco","state":"CA","zip":"94101","country":"USA"}
                }
                """;
    }

    public static String createTestCustomers() {
        return """
                [
                    {
                        "customerId": 1,
                        "name": {"firstName":"John","lastName":"Doe"},
                        "contact": {"email":"john.doe@example.com","phone":"123-456-7890"},
                        "address": {"street":"123 Main St","city":"Springfield","state":"IL","zip":"62701","country":"USA"}
                    },
                    {
                        "customerId": 2,
                        "name": {"firstName":"Jane","lastName":"Smith"},
                        "contact": {"email":"jane.smith@example.com","phone":"987-654-3210"},
                        "address": {"street":"456 Oak St","city":"Chicago","state":"IL","zip":"60605","country":"USA"}
                    },
                    {
                        "customerId": 3,
                        "name": {"firstName":"Alice","lastName":"Brown"},
                        "contact": {"email":"alice.brown@example.com","phone":"555-123-4567"},
                        "address": {"street":"789 Pine St","city":"Los Angeles","state":"CA","zip":"90001","country":"USA"}
                    },
                    {
                        "customerId": 4,
                        "name": {"firstName":"Bob","lastName":"White"},
                        "contact": {"email":"bob.white@example.com","phone":"555-987-6543"},
                        "address": {"street":"101 Maple St","city":"New York","state":"NY","zip":"10001","country":"USA"}
                    },
                    {
                        "customerId": 5,
                        "name": {"firstName":"Charlie","lastName":"Green"},
                        "contact": {"email":"charlie.green@example.com","phone":"555-456-7890"},
                        "address": {"street":"202 Birch St","city":"San Francisco","state":"CA","zip":"94101","country":"USA"}
                    }
                ]
                """;
    }
}
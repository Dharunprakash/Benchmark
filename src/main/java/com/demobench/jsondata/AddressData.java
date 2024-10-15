package com.demobench.jsondata;

public class AddressData {

    public static String createTestAddress1() {
        return "{\"street\":\"123 Main St\",\"city\":\"Springfield\",\"state\":\"IL\",\"zip\":\"62701\",\"country\":\"USA\"}";
    }

    public static String createTestAddress2() {
        return "{\"street\":\"456 Oak St\",\"city\":\"Chicago\",\"state\":\"IL\",\"zip\":\"60605\",\"country\":\"USA\"}";
    }

    public static String createTestAddress3() {
        return "{\"street\":\"789 Pine St\",\"city\":\"Los Angeles\",\"state\":\"CA\",\"zip\":\"90001\",\"country\":\"USA\"}";
    }

    public static String createTestAddress4() {
        return "{\"street\":\"101 Maple St\",\"city\":\"New York\",\"state\":\"NY\",\"zip\":\"10001\",\"country\":\"USA\"}";
    }

    public static String createTestAddress5() {
        return "{\"street\":\"202 Birch St\",\"city\":\"San Francisco\",\"state\":\"CA\",\"zip\":\"94101\",\"country\":\"USA\"}";
    }

    public static String createTestAddresses() {
        return """
                [
                    {"street":"123 Main St","city":"Springfield","state":"IL","zip":"62701","country":"USA"},
                    {"street":"456 Oak St","city":"Chicago","state":"IL","zip":"60605","country":"USA"},
                    {"street":"789 Pine St","city":"Los Angeles","state":"CA","zip":"90001","country":"USA"},
                    {"street":"101 Maple St","city":"New York","state":"NY","zip":"10001","country":"USA"},
                    {"street":"202 Birch St","city":"San Francisco","state":"CA","zip":"94101","country":"USA"}
                ]
                """;
    }
}
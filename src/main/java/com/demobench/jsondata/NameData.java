package com.demobench.jsondata;

public class NameData {

    public static String createTestName1() {
        return "{\"firstName\":\"John\",\"lastName\":\"Doe\"}";
    }

    public static String createTestName2() {
        return "{\"firstName\":\"Jane\",\"lastName\":\"Smith\"}";
    }

    public static String createTestName3() {
        return "{\"firstName\":\"Alice\",\"lastName\":\"Brown\"}";
    }

    public static String createTestName4() {
        return "{\"firstName\":\"Bob\",\"lastName\":\"White\"}";
    }

    public static String createTestName5() {
        return "{\"firstName\":\"Charlie\",\"lastName\":\"Green\"}";
    }

    public static String createTestName6() {
        return "{\"firstName\":\"David\",\"lastName\":\"Black\"}";
    }

    public static String createTestName7() {
        return "{\"firstName\":\"Eve\",\"lastName\":\"Red\"}";
    }

    public static String createTestName8() {
        return "{\"firstName\":\"Frank\",\"lastName\":\"Yellow\"}";
    }

    public static String createTestName9() {
        return "{\"firstName\":\"Grace\",\"lastName\":\"Blue\"}";
    }

    public static String createTestName10() {
        return "{\"firstName\":\"Henry\",\"lastName\":\"Purple\"}";
    }

    public static String createTestNames() {
        return """
                [
                    {"firstName":"John","lastName":"Doe"},
                    {"firstName":"Jane","lastName":"Smith"},
                    {"firstName":"Alice","lastName":"Brown"},
                    {"firstName":"Bob","lastName":"White"},
                    {"firstName":"Charlie","lastName":"Green"},
                    {"firstName":"David","lastName":"Black"},
                    {"firstName":"Eve","lastName":"Red"},
                    {"firstName":"Frank","lastName":"Yellow"},
                    {"firstName":"Grace","lastName":"Blue"},
                    {"firstName":"Henry","lastName":"Purple"}
                ]
                """;
    }
}

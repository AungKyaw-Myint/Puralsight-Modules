package com.pluralsight;

public class Person {

    private String firstName;
    private String lastName;
    private String Prefix;
    private String middleName;
    private String suffix;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getPrefix() {
        return Prefix;
    }

    public void setPrefix(String prefix) {
        Prefix = prefix;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public static String format(String firstName,
                                String lastName){

        return firstName + " " + lastName;
    }
    public static String format(String prefix,
                                String firstName,
                                String middleName,
                                String lastName,
                                String suffix){

        String result = "";

        if (isNotBlank(prefix)) {
            result += prefix + " ";
        }

        if (isNotBlank(firstName)) {
            result += firstName + " ";
        }

        if (isNotBlank(middleName)) {
            result += middleName + " ";
        }

        if (isNotBlank(lastName)) {
            result += lastName;
        }

        result = result.trim();

        if (isNotBlank(suffix)) {
            result += ", " + suffix;
        }

        return result;
    }
    public static String format(String fullName){

        fullName = fullName.trim().replaceAll("\\s+", " ");

        // Clean spacing around commas
        fullName = fullName.replaceAll("\\s*,\\s*", ", ");

        return fullName;
    }

    private static boolean isNotBlank(String value) {
        return value != null && !value.trim().isEmpty();
    }
}

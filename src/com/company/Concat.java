package com.company;

public class Concat {
    private String builder = new String();

    public String concatenateStrings(String str1, String str2) {
        builder = str1 + " " + str2;
        System.out.println(builder);
        return builder;
    }

    public String getBuilder() {
        return builder;
    }
}

package com.company;

public class Case {

    private String upperCase;
    private String banana;

    public void upperCase(String alphabet2){
        upperCase = alphabet2.toUpperCase();
        System.out.println(upperCase);
    }

    public void lowerCase (String alphabet){
        banana = alphabet.toLowerCase();
        System.out.println(banana);
    }

}

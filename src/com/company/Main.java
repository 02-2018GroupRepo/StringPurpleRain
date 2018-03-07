package com.company;

public class Main {

    public static void main(String[] args) {
        //number one
        Concat cc1 = new Concat();
        String str1 = "Java";
        String str2 = "Programming";
       cc1.concatenateStrings(str1, str2);

        //number two
        Length length = new Length();
        String result = cc1.getBuilder();
        length.lengthOfString(result);

        //number three
        Case switchCase = new Case();
        String str3 = "ABcdeF";
        switchCase.lowerCase(str3);
        switchCase.upperCase(str3);

        String[] arr = {"Dina", "Shane", "NaDario", "Amber", "Calder", "Noelle", "Donell"};
        FindMe find = new FindMe(arr);
        find.findStudents("Noelle");
        find.findStudents("Jake");
        find.findStudents("NaDario");
        find.findStudents("Dina");


    }
}

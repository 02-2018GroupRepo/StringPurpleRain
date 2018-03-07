package com.company;

public class FindMe {

    String[] students;

    public FindMe(String[] students) {
        this.students = students;
    }

    public void findStudents(String stu) {
        boolean found = false;
        for (int i = 0; i < students.length; i++) {
            if (stu.equalsIgnoreCase(students[i])) {
                System.out.println("Found at index " + i);
                found = true;
            }
        }
        // can also write as found == false
        if(!found){
            System.out.println("Not in List");
    }

}
}

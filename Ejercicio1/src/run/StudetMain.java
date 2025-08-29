package run;

import models.Student;

public class StudetMain {
    public static void main(String[] args) {
        Student s1 = new Student("Allan Valentin", "2025-001", 85);

        System.out.println(s1.showStudentData());
    }
}

package ru.bobrysheva.university.util;

public class Teacher extends Univers {
    public int numStudents;
    public String profileSubject;

    public Teacher (int age, String name, int numStudents, String profileSubject){
        super (age, name);
        this.numStudents = numStudents;
        this.profileSubject = profileSubject;
    }
}

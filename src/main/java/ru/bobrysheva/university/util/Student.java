package ru.bobrysheva.university.util;

public class Student extends Univers {
    int course;
    public float GPA;

    public Student (int age, String name, int course, float GPA){
        super (age, name);
        this.course = course;
        this.GPA = GPA;
    }
}

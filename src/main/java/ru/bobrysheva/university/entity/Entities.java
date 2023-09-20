package ru.bobrysheva.university.entity;

import ru.bobrysheva.university.util.Student;
import ru.bobrysheva.university.util.Teacher;

public class Entities {
    public static void Student() {
        Student Nicolay = new Student(23, "Nikolay", 5, 4);
        System.out.println("Имя студента " + Nicolay.name + " Срединй балл студента " + Nicolay.GPA);
    }

    public static void Teacher() {
        Teacher Olga = new Teacher(23, "Olga", 39, "Maths");
        System.out.println("Имя преподавателя " + Olga.name + " Количество студентов " + Olga.numStudents);
    }
}

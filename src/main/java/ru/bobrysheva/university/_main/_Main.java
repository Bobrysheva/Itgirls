package ru.bobrysheva.university._main;
import ru.bobrysheva.university.util.Student;
import ru.bobrysheva.university.util.Teacher;

public class _Main {
    public static void main(String[] args) {
        Student Nicolay = new Student (23, "Nikolay", 5, 4);
        System.out.println ("Имя студента " + Nicolay.name + " Срединй балл студента " + Nicolay.GPA);

        Teacher Olga = new Teacher(23, "Olga", 39, "Maths");
        System.out.println("Имя преподавателя " + Olga.name + " Количество студентов " + Olga.numStudents);
    }
}

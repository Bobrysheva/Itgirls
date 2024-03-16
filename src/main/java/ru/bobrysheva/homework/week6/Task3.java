package ru.bobrysheva.homework.week6;

public class Task3 {

    enum Weak {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    public static void main(String[] args) {
        String i = "FRIDAY";
        Weak weak = Weak.FRIDAY;
        switch (weak) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                System.out.println("Задан будний день");
                break;
            default:
                System.out.println("Задан выходной день");
                break;
        }
    }
}

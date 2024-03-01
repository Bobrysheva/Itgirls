package ru.bobrysheva.homework.strings;

public class task1 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
//        char c = str.charAt(13);
//        System.out.println(c);
//        boolean a = str.endsWith("!!!");
//        System.out.println(a);
//        boolean b = str.startsWith("I like");
//        System.out.println(b);
//        boolean d = str.contains("Java");
//        System.out.println(d);
//        int f = str.indexOf("Java");
//        System.out.println(f);
//        String g = str.replace("a", "o");
//        System.out.println(g);
//        String h = str.toUpperCase();
//        System.out.println(h);
//        System.out.println(str.toLowerCase());
//        StringBuilder sb = new StringBuilder();
//        int a = 3;
//        int b = 56;
//        sb.append(a);
//        sb.append("+");
//        sb.append(b);
//        sb.append("=");
//        sb.append(a+b);
//        System.out.println(sb);
//        System.out.println(sb.toString().replace("=", "равно"));
        String str2 = "Object-oriented programming is a programming language model organized around objects rather than. Object-oriented programming blabla";
        String replStr1 = str2.replace("Object-oriented programming", "OOP");
        System.out.println(replStr1);


    }
}

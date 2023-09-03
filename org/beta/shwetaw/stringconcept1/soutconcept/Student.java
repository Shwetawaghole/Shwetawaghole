package org.beta.shwetaw.stringconcept1.soutconcept;

class Student1 {
    static Student1 stud = new Student1();

    public static void length1() {
        System.out.println("Inside length method");
    }

    public void getLength() {
        Student1.stud.length1();
    }
}

public class Student {

    static String name = "Shweta";


    public void m1() {
     System.out.println("the length of String Shweta is Length is" + Student.name.length()); //Length is a method present in String class
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.m1();
        Student1.length1();
        System.out.println();

    }
}


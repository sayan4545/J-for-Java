package OOPS;

import java.util.Arrays;

public class OOPS_01 {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));
        Student Sayan = new Student();
        System.out.println(Sayan.name);
        Student s2 = new Student("rahul",6,100);
        System.out.println(s2.marks+" "+s2.rno+" "+s2.name);
        Student s3 = new Student(s2);
        System.out.println(s2);
        System.out.println(s3);
        Student s4 = new Student("Kaushal",56);
        System.out.println((s4.name +" "+s4.marks+" "+s4.rno));


    }
}
class Student{
    int rno;
    String name;
    float marks;
    Student(){
        this.name = "Chandrika";
        this.rno = 12;
        this.marks = 100;
    }
    Student(String name,int rno,float marks){
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }
    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    Student(String name, int rno){
        this.name = name;
        this.rno = rno;
        this.marks = 0.0f;

    }
}

package maps;

import java.util.ArrayList;
import java.util.List;

public class ComparableImpl {
    public static void main(String[] args) {
        Student s1 = new Student("Sayan",9.98);
        Student s2 = new Student("Chandrika",9.99);
        Student s3 = new Student("rajdeep",9.00);
        List<Student> newList = new ArrayList<>();
        newList.add(s1);
        newList.add(s2);
        newList.add(s3);
        newList.sort(null);
        System.out.println(newList);
    }


}
class Student implements Comparable<Student>{
    String name;
    double gpa;
    Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student o) {
        //return (int)(o.gpa-this.gpa);
        return Double.compare(this.gpa,o.gpa);

    }
    public String toString(){
        return "name"+" : "+ name + ", "+ " gpa"+" : "+ gpa;
    }
}

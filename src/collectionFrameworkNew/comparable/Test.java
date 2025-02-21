package collectionFrameworkNew.comparable;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student("Ankit",3.87);
        Student s2 = new Student("Chandrika",3.56);
        Student s3 = new Student("Sayan",3.77);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        System.out.println(studentList);
        studentList.sort(null);
        System.out.println(studentList);
    }
}

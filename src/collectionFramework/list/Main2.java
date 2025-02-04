package collectionFramework.list;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
class MyStringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.length()-o1.length();
    }
}
public class Main2 {
    public static void main(String[] args) {
//        List<Integer> l1 = new ArrayList<>();
//        l1.add(90);
//        l1.add(100);
//        l1.add(1000);
//        l1.sort(new MyComparator());
//        System.out.println(l1);
//        List<String> l2 = new ArrayList<>();
//        l2.add("H");
//        l2.add("BH");
//        l2.add("BHHH");
//        //l2.sort(new MyStringComparator());
//        l2.sort((a,b)->b.length()-a.length());
//        System.out.println(l2);
        Student s1 = new Student("Sayan",3.56);
        Student s2 = new Student("Chandrika",4.00);
        Student s3 = new Student("Anish",2.67);
        Student s4 = new Student("Bibek",3.56);
        List<Student> l1 = new ArrayList<>();
        l1.add(s1);
        l1.add(s2);
        l1.add(s3);
        l1.add(s4);
        l1.sort((o1,o3)-> {
                    if (o3.getGpa() - o1.getGpa() > 0) {
                        return 1;
                    }
                    if (o3.getGpa() - o1.getGpa() < 0) {
                        return -1;
                    } else {
                        return o1.getName().compareTo(o3.getName());
                    }
                });
        Comparator<Student> comparing = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        l1.sort(comparing);
        System.out.println(l1);
    }
}

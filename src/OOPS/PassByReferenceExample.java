package OOPS;

public class PassByReferenceExample {
    public static void main(String[] args) {
        Class<? extends String> C = "Sayan".getClass();
        System.out.println(C.getName());
        Tv tv1 = new Tv("Sony",90888);
        System.out.println(tv1.name);
        changeName(tv1);
        System.out.println(tv1.name);
        Integer num = new Integer(56);
        Integer num2 = new Integer(89);
        swap(num,num2);
        System.out.println(num + " "+ num2);
        int temp = num;
        num = num2;
        num2 = temp;
        System.out.println(num+ " "+ num2);
        final Integer a = 34;
        Employee e1 = new Employee("Rohan Saxena",87000,76);
        //e1.emp_id =90;
        e1.salary=89;
        e1.name = "Gaurav";
        System.out.println(e1.emp_id+e1.name+ e1.salary);
        e1 = new Employee("Sayan C",98888,98);
        final Employee e2 = new Employee("Chandrika Dey",87000,87);





    }
    static void changeName(Tv tv){
        tv.name = "BARON";
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
class Tv{
    String name;
    long cost;
    Tv(String name,long cost){
        this.name = name;
        this.cost = cost;
    }
}
final class Employee{
    String name;
    int salary;
    final int emp_id;
    Employee(String name,int salary,final int emp_id){
        this.name = name;
        this.salary= salary;
        this.emp_id = emp_id;
    }
}

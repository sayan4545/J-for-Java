package lecture1;

import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer datatype: ");
        int a = sc.nextInt();
        System.out.println("Printing the integer datatype: "+ a);
        System.out.println("Enter a float datatype: ");
        float marks = sc.nextFloat();
        System.out.println("The marks obtained is: "+marks);
        System.out.println("Enter the salary: ");
        double salary = sc.nextDouble();
        System.out.println("the salary is : "+ salary);
        System.out.println("Enter the aadharId: ");
        long aadharId = sc.nextLong();
        System.out.println("The aadharId is : "+ aadharId);
    }
}

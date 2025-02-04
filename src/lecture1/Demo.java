package lecture1;

import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
       /* int a = sc.nextInt();
        System.out.println("The input from the keyboard is : "+ a);
        //System.out.println(a);*/
        System.out.println("take an string input");
        String str = sc.nextLine();
        System.out.println(str);
    }
}

package lecture1;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp uin celsius: ");
        float t = sc.nextFloat();
        float f = (float)((t*9/5) +32);
        System.out.println("The temperature in f is : "+ f);



    }
}

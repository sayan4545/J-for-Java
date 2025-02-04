package lecture1;

import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        System.out.println("Get an input:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String str = sc.next();
        System.out.println(a+b+c+str);

    }
}

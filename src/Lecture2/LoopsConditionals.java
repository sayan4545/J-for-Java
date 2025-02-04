package Lecture2;

import java.util.Scanner;

public class LoopsConditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salarty:");
        int salary = sc.nextInt();
        System.out.println("The salary before revisiopn is: "+salary);
        if(salary>=10000){
            salary +=10000;
        }else{
            salary+=5000;
        }
        System.out.println("The revised salary is: "+salary);
    }
}

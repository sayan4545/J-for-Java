package collectionFrameworkNew;

import java.util.ArrayList;

public class ArrayListImpl{
    public static void main(String[] args) {
        // creating an arrayList
        ArrayList<Integer> arrayList1 = new ArrayList<>(10);
        // adding elements to the arrayList-->
        arrayList1.add(1);
        arrayList1.add(10);
        arrayList1.add(100);
        arrayList1.add(10000);
        // printing an arrayList-->
        System.out.println(arrayList1);
        System.out.println(arrayList1.get(1));
        // size of the arrayList
        System.out.println("Size of the arrayList is : " + arrayList1.size());
        // printing the elements
        for (Integer integer : arrayList1) {
            System.out.println(integer);
        }
        //To check the existence of an element in the list
        System.out.println(arrayList1.contains(3));// false
        System.out.println(arrayList1.contains(1));//true
    }




}

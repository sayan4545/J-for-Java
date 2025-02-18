package collectionFrameworkNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        arrayList1.add(2,20);
        arrayList1.remove(3);
        System.out.println(arrayList1); //1,10,20,10000
        arrayList1.set(2,23);
        System.out.println(arrayList1);
        Integer[] arr = new Integer[10];
        arr[0]=1;
        arr[1]=90;
        arr[2]=100;
        List<Integer> list = Arrays.asList(arr);
        System.out.println(arr.getClass().getName());
        String strArray[] = new String[5];
        strArray[0]= "Bob";
        strArray[1]= "Alice";
        strArray[2]="Candy";
        strArray[3]= "Candice";
        strArray[4]= "Beep";
        List<String> list1 = Arrays.asList(strArray);
        //list1.add("Sayan");-->: Arrays.asList returns a fixed size list. will throw exception in this case.
        System.out.println(list1);
        List<String> list2 = new ArrayList<>(Arrays.asList(strArray));
        list2.add("Sayan");
        System.out.println(list2);
    }




}

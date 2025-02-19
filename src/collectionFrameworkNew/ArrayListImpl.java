package collectionFrameworkNew;

import java.util.*;

class StringCompare implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length() -o2.length();
    }
}

public class ArrayListImpl{
    public static void main(String[] args) {
        // creating an arrayList
//        ArrayList<Integer> arrayList1 = new ArrayList<>(10);
//        // adding elements to the arrayList-->
//        arrayList1.add(1);
//        arrayList1.add(10);
//        arrayList1.add(100);
//        arrayList1.add(10000);
//        // printing an arrayList-->
//        System.out.println(arrayList1);
//        System.out.println(arrayList1.get(1));
//        // size of the arrayList
//        System.out.println("Size of the arrayList is : " + arrayList1.size());
//        // printing the elements
//        for (Integer integer : arrayList1) {
//            System.out.println(integer);
//        }
//        //To check the existence of an element in the list
//        System.out.println(arrayList1.contains(3));// false
//        System.out.println(arrayList1.contains(1));//true
//        arrayList1.add(2,20);
//        arrayList1.remove(3);
//        System.out.println(arrayList1); //1,10,20,10000
//        arrayList1.set(2,23);
//        System.out.println(arrayList1);
//        Integer[] arr = new Integer[10];
//        arr[0]=1;
//        arr[1]=90;
//        arr[2]=100;
//        List<Integer> list = Arrays.asList(arr);
//        System.out.println(arr.getClass().getName());
//        String strArray[] = new String[5];
//        strArray[0]= "Bob";
//        strArray[1]= "Alice";
//        strArray[2]="Candy";
//        strArray[3]= "Candice";
//        strArray[4]= "Beep";
//        List<String> list1 = Arrays.asList(strArray);
//        //list1.add("Sayan");-->: Arrays.asList returns a fixed size list. will throw exception in this case.
//        System.out.println(list1);
//        List<String> list2 = new ArrayList<>(Arrays.asList(strArray));
//        list2.add("Sayan");
//        System.out.println(list2);
//        List<String> listNames = List.of("Sayan", "Chandrika", "Bob");
//        //  The list.of returns a list of unmodifiable elements.
//        String[] strArray ={"Bob","Alice"};
//        ArrayList<String> strArrayList = new ArrayList<>(Arrays.asList(strArray));
//        strArrayList.set(1,"Candy");
//        System.out.println(strArrayList);
//        List<Integer> l1 = new ArrayList<>();
//        l1.add(1);
//        l1.add(2);
//        l1.add(3);
//        List<Integer> l2 = List.of(4,5,6);
//        l1.addAll(l2);
//        System.out.println(l1);
//        System.out.println(l2);
//        System.out.println(l1.remove(Integer.valueOf(4)));// list.remove() return a boolean value.
//        System.out.println(l1);
//
//        List<String> newList = new ArrayList<>();
//        newList.add("Chandrika Dey");
//        newList.add("Sayan Chatterjee");
//        newList.add("Xyzuh");
//        String[] newArrayStr = newList.toArray(new String[0]);
//        System.out.println(Arrays.toString(newArrayStr));

        List<Integer> integerList = new ArrayList<>(Arrays.asList(17,6,3,0,1,19));
        integerList.add(56);
        //Collections.sort(integerList);
        //integerList.sort(null);
        System.out.println(integerList);
        integerList.sort((o1,o2)->o1-o2);
        System.out.println("After sorting: "+ integerList);
        // To sort in descending order
        integerList.sort((o1,o2)->o2-o1);
        System.out.println("After sorting in descending order: " + integerList);

        List<String> strList = new ArrayList<>(Arrays.asList("Bob","candice","mark"));
        System.out.println(strList);
        strList.sort((o1,o2)->o1.length()-o2.length());
        System.out.println("After sorting in ascending order of the length of the strings : "+strList);
        strList.sort((o1,o2)->o2.length()-o1.length());
        System.out.println("After sorting in descending order of the length of the strings: "+ strList);
        strList.sort(new StringCompare());
        System.out.println("Sorted in ascending order of their lengths: " + strList);





    }




}

package collectionFrameworkNew;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListImpl {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> c1 = new CopyOnWriteArrayList<>();
        //c1.add(1);
        Thread t3 = new Thread(()->{
            for(int i=0;i<1000;i++){
                c1.add(i);
            }
        });
        Thread t4 = new Thread(()->{
            for(int i=0;i<1000;i++){
                c1.add(i);
            }
        });
        t3.start();
        t4.start();
        try{
            t3.join();
            t4.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(c1.size());
        //List<String> shoppingList = new ArrayList<>();
        // If we implement this piece of code with arrayList , this will throw an exception
        // concurrentModification exception. To go with simultaneuos reading and writing , choose
        //CopyOnWriteArrayList. Because , for COWA , modifications are carried on on a separate copy of the list. So
        // thread safe.
        CopyOnWriteArrayList<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("EGGS");
        shoppingList.add("BUTTER");
        shoppingList.add("PAPAD");
        shoppingList.add("GHEE");

        for(String str : shoppingList){
            System.out.println(str);
            if(str.equals("EGGS")){
                shoppingList.add("CHICKEN");
            }

        }
        System.out.println("Updated list: "+shoppingList);

    }
}

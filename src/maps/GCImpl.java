package maps;

import java.lang.ref.WeakReference;

public class GCImpl {
    public static void main(String[] args) {
        WeakReference<Phone> phone1 = new WeakReference<>(new Phone("Nokia","Limia"));
        System.out.println(phone1.get());
        System.gc();
        try{
            Thread.sleep(10000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(phone1.get());
    }

    //WeakReference<Phone> phone1 = new WeakReference<>(new Phone("Nokia","Limia"));

}
class Phone{
    String brand;
    String model;
    Phone(String brand,String model){
        this.brand= brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

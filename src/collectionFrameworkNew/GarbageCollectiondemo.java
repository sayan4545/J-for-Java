package collectionFrameworkNew;

import maps.WeakHashMapImpl;

import java.lang.ref.WeakReference;

class Phone{
    private String model;
    private int price;

    public Phone(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
public class GarbageCollectiondemo {
    public static void main(String[] args) {
//        Phone ph1 = new Phone("Apple IPhone 16",89000);
//        ph1 = null;
//        System.gc();
//        System.out.println(ph1);
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Nokia",9000));
        System.out.println(phoneWeakReference.get());
        System.gc();
        try{
            Thread.sleep(10000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("printing the weak refrence again" +": "+ phoneWeakReference.get());
    }

}

package CollectIonFrameWorkAndMap;

import java.util.WeakHashMap;
class Image{
    private String name;
    public Image(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return "name: "+ getName();
    }
}
public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String,Integer> weakHashMap = new WeakHashMap<>(10,0.6f);
        weakHashMap.put("Alice",100);
        weakHashMap.put("Bob",99);
        weakHashMap.put("Candy",88);
        weakHashMap.put("Derby",100);
        System.out.println(weakHashMap);
        WeakHashMap<String,Image> imageCache = new WeakHashMap<>();
        Image img1 = new Image("img1");
        Image img2 = new Image("img2");
        Image img3 = new Image("img3");
        imageCache.put(new String("Image 1"),img1);
        imageCache.put(new String("Image 2"),img2);
        imageCache.put(new String("Image 3"),img3);
        System.out.println(imageCache);
        System.gc();
        try{
            Thread.sleep(10000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(imageCache);
    }
}

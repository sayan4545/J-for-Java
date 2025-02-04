package maps;

import java.util.WeakHashMap;

public class WeakHashMapImpl {
    public static void main(String[] args) {
        WeakHashMap<String,Image> weakMap = new WeakHashMap<>();
        weakMap.put(new String("image 1"),new Image("img1"));
        weakMap.put(new String("Image 2"),new Image("img2"));
        System.out.println(weakMap);
        System.gc();
        Simulation();
        System.out.println(weakMap);


    }
    public static void Simulation(){
        try{
            System.out.println("Simulating..");
            Thread.sleep(10000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class Image{
    String img;
    Image(String img){
        this.img = img;
    }

    @Override
    public String toString() {
        return "Image{" +
                "img='" + img + '\'' +
                '}';
    }
}

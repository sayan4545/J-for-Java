package generics;
import java.util.Arrays;
public class CustomArrayList<T>  {
    private int size = 0;
    private static int DEFAULT_SIZE = 10;
    private Object[] data;
    public CustomArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            this.resize();
        }
        data[size++] = num;
    }
    private void resize() {
        Object[] temp = new Object[data.length*2];
        for(int i=0;i<data.length;i++){
            data[i]= temp[i];
        }
        data = temp;
    }
    public T remove(){
        T removed =(T)data[--size];
        return removed;
    }
    public T get(int index){
        return(T)data[index];
    }
    public void set(int index, int value){
        data[index]= value;
    }
    public int size(){
        return size;
    }
    @Override
    public String toString() {
        return "CustomArrayList{" +
                "size=" + size +
                ", data=" + Arrays.toString(data) +
                '}';
    }
    private boolean isFull() {
        return size == data.length;
    }
}

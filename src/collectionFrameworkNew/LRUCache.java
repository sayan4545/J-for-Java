package collectionFrameworkNew;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private int capacity;

    public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {
        LRUCache<String,Integer> studentCache = new LRUCache<>(3);
        studentCache.put("Alice",100);
        studentCache.put("Bob",99);
        studentCache.put("candy",90);
        studentCache.get("Alice");
        studentCache.put("Ganesh",0);
        System.out.println(studentCache);

    }
}

package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    int capacity;
    LRUCache(int capacity){
        super(capacity,3,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {
        LRUCache<String,Integer> cache = new LRUCache<>(4);
        cache.put("Alice",100);
        cache.put("Bob",89);
        cache.put("Amal",88);
        cache.put("br",900);
        cache.get("Alice");
        cache.put("Sayan",19);
        System.out.println(cache);
    }
}


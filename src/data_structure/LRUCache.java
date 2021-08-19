package data_structure;

import java.util.LinkedHashMap;
import java.util.Map;
/*
Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:

LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
int get(int key) Return the value of the key if the key exists, otherwise return -1.
void put(int key, int value) Update the value of the key if the key exists.
    Otherwise, add the key-value pair to the cache.
    If the number of keys exceeds the capacity from this operation, evict the least recently used key.
    SOLUTION 1
    Declare a LinkedHashMap, use GET, use PUT, and override the removeEldestEntry with local value

 */
class LRUCache {
    LinkedHashMap<String, Integer> listaHash;

    public LRUCache(int capacity) {
        listaHash = new LinkedHashMap<String, Integer>(capacity, 0.75F, true) {
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(String key) {

        return listaHash.getOrDefault(key, -1);
    }

    public void put(String key, int value) {

        listaHash.put(key, value);
    }

    public static void main (String[] args) {

        LRUCache obj = new LRUCache(3);

        obj.put("VALOR", 100);
        obj.put("Justicia", 10);
        obj.put("Honor", 99);
        obj.put("Hodor", 999);
        obj.put("Valor", 1000);

        int result = obj.get("VALOR");
        int result2 = obj.get("VALOa");
        int result3 = obj.get("Honor");
        System.out.println("SIZE " + obj.listaHash.size());

    }
}
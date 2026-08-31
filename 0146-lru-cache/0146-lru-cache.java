import java.util.*;

class LRUCache {

    int capacity;
    HashMap<Integer, Integer> map = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {

        if (!map.containsKey(key))
            return -1;

        list.remove((Integer) key);
        list.add(key);

        return map.get(key);
    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {
            list.remove((Integer) key);
        }

        map.put(key, value);
        list.add(key);

        if (list.size() > capacity) {
            int lru = list.remove(0);
            map.remove(lru);
        }
    }
}
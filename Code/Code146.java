import java.util.LinkedHashMap;
import java.util.Map;

public class Code146 {
    
    //请你设计并实现一个满足 LRU (最近最少使用) 缓存 约束的数据结构。

    //思路：哈希表 + 双线链表

}
class LRUCache {

    private int capacity;
    LinkedHashMap<Integer, Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<>(capacity, 0.75f, true);
    }
    
    public int get(int key) {
        
        return map.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        
        map.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

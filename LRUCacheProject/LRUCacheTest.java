public class LRUCacheTest {
    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
        
        lru.put(1, 1);
        lru.put(2, 2);
        System.out.println(lru.get(1));  // 1
        
        lru.put(3, 3);
        System.out.println(lru.get(2));  // -1
        
        lru.put(4, 4);
        System.out.println(lru.get(1));  // -1
        System.out.println(lru.get(3));  // 3
        System.out.println(lru.get(4));  // 4
    }
}

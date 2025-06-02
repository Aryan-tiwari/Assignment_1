public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap obj = new MyHashMap();
        obj.put(1, 10);
        obj.put(2, 20);
        System.out.println(obj.get(1));  // Output: 10
        System.out.println(obj.get(3));  // Output: -1
        obj.put(2, 30);
        System.out.println(obj.get(2));  // Output: 30
        obj.remove(2);
        System.out.println(obj.get(2));  // Output: -1
    }
}

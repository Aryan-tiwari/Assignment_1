import java.util.LinkedList;

public class MyHashMap {
    private static final int SIZE = 769;  // A prime number of buckets
    private LinkedList<Node>[] buckets;

    // Node class to store key-value pairs
    private static class Node {
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        for (Node node : buckets[index]) {
            if (node.key == key) {
                node.value = value;  // Update
                return;
            }
        }
        buckets[index].add(new Node(key, value));  // Insert
    }

    public int get(int key) {
        int index = hash(key);
        for (Node node : buckets[index]) {
            if (node.key == key) {
                return node.value;
            }
        }
        return -1;  // Not found
    }

    public void remove(int key) {
        int index = hash(key);
        Node toRemove = null;
        for (Node node : buckets[index]) {
            if (node.key == key) {
                toRemove = node;
                break;
            }
        }
        if (toRemove != null) {
            buckets[index].remove(toRemove);
        }
    }
}

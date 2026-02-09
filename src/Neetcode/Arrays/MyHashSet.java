package Neetcode.Arrays;

import java.util.HashSet;

public class MyHashSet {
    HashSet<Integer> set;

    public MyHashSet() {
        set = new HashSet<>();
    }

    public void add(int key) {
        set.add(key);
    }

    public void remove(int key) {
        set.remove(key);
    }

    public boolean contains(int key) {
        return set.contains(key);
    }
    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();   // []
        obj.add(1);                        // [1]
        obj.add(2);                        // [1,2]
        obj.contains(1);   // true
        obj.contains(3);   // false
        obj.add(2);                        // [1,2] (no duplicates)
        obj.contains(2);   // true
        obj.remove(2);                     // [1]
        obj.contains(2);   // false
    }
}

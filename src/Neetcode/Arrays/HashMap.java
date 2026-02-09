package Neetcode.Arrays;

class MyHashMap {
    java.util.HashMap<Integer, Integer> map;

    public MyHashMap() {
        map = new java.util.HashMap<>();
    }

    public void put(int key, int value) {
        map.put(key, value);
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void remove(int key) {
        map.remove(key);
    }

    // ✅ main method INSIDE the class
    public static void main(String[] args) {

        MyHashMap obj = new MyHashMap();

        obj.put(1, 1);
        obj.put(2, 2);

        System.out.println(obj.get(1)); // 1
        System.out.println(obj.get(3)); // -1

        obj.put(2, 1);
        System.out.println(obj.get(2)); // 1

        obj.remove(2);
        System.out.println(obj.get(2)); // -1
    }
}

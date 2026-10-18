package Hashmaps;

import java.util.HashMap;

// In this we will learn about the hash maps in the data structures.

// A HashMap is a data structure that stores elements in key–value pairs and allows fast access, insertion, and deletion operations. It uses a technique called hashing to compute an index (or "bucket") where the value associated with a key is stored.

// In hashmaps if you want to search for a element then it doesnot do the traversing from the starting to the end it directly jumps to the element that we wanted to search that's why it is faster in the execution.

// In hashmap data set we need all the element as the positive numbers by using the hashcode.

// Sometimes the hashcode can be veery large so the basic idea is to reduce it.

// HashCode() is a method defined in Java’s Object class. It returns an integer value (hash code) that represents the object.


public class Introduction {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kunal", 89);
        map.put("Parth", 85);
        map.put("Tanish", 99);
        System.out.println(map.get("Tanish"));
    }
}

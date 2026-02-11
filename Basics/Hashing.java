import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {

        // =========================
        // HashSet Example
        // =========================
        HashSet<Integer> hash = new HashSet<>();
        hash.add(12);
        hash.add(13);
        hash.add(14);

        System.out.println(hash.contains(12));
        hash.remove(13);
        System.out.println(hash);

        // Iterating over HashSet using Iterator
        Iterator<Integer> it = hash.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // =========================
        // HashMap Basic Operations
        // =========================
        HashMap<String, Integer> map = new HashMap<>();
        map.put("IND", 1);
        map.put("CHI", 2);
        map.put("USA", 3);

        System.out.println(map.containsKey("CHI"));
        System.out.println(map.get("CHI"));
        System.out.println(map);

        // Iterating over HashMap
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        // =========================
        // Array Traversal
        // =========================
        int[] arr1 = {1, 2, 4};
        for (int val : arr1) {
            System.out.println(val);
        }

        // =========================
        // Count Frequency of Integers
        // =========================
        int[] arr2 = {11, 2, 3, 2, 3, 5, 6, 5, 6, 5, 3, 2, 11, 3};
        HashMap<Integer, Integer> freqInt = new HashMap<>();

        for (int i = 0; i < arr2.length; i++) {
            freqInt.put(arr2[i], freqInt.getOrDefault(arr2[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : freqInt.entrySet()) {
            System.out.println("No of " + e.getKey() + ": " + e.getValue());
        }

        // =========================
        // Count Frequency of Characters (char array)
        // =========================
        char[] charArr = {'a', 'b', 'a', 'c', 'b', 'a'};
        HashMap<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < charArr.length; i++) {
            charMap.put(charArr[i], charMap.getOrDefault(charArr[i], 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // =========================
        // Count Frequency of Characters (String)
        // =========================
        HashMap<Character, Integer> map2 = new HashMap<>();
        String s = "asasdsa";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        // Map<String, Integer> map = new HashMap<>(); // declares an empty Map which stores elements using hash
        Map<String, Integer> map = new TreeMap<>(); // declares an empty Map which stores elements after sorting on the basis of keys

        map.put("One", 1); // adding elements
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);

        map.remove("Three"); // removing elements using keys

        // if (!map.containsKey("Two")) {
        //     map.put("Two", 23);
        // }

        map.putIfAbsent("Two", 23); // only adds if key is missing

        System.out.println(map.containsValue(3));
        System.out.println(map.isEmpty());

        System.out.println(map);
        // iterate methods
        for (Map.Entry<String, Integer> e: map.entrySet()) {
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String key: map.keySet()) {
            System.out.println(key);
        }

        for (Integer value: map.values()) {
            System.out.println(value);
        }

        // map.clear();
    }
}

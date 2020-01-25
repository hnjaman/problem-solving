package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Testmap2 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);

        Map<String, Integer> map2 = new HashMap<String, Integer>();
        map2.put("a", 4);
        map2.put("b", 5);
        map2.put("d", 6);

        Set<String> keySet = new HashSet<String>();
        keySet.addAll(map1.keySet());
        keySet.addAll(map2.keySet());

        Map<String, Integer> map3 = new HashMap<String, Integer>();
        Integer val1, val2;
        for (String key : keySet) {
            val1 = map1.get(key);
            val1 = (val1 == null ? 0 : val1);
            val2 = map2.get(key);
            val2 = (val2 == null ? 0 : val2);
            map3.put(key, val1 + val2);
        }

        System.out.println(map3.toString());
    }
}

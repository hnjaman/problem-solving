package map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Testmap {
    public static void main(String[] args) {

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        System.out.println(integers);

        Map<String, Integer> m1 = new HashMap<>();
        m1.put("a", 1);
        m1.put("b", 2);
        Map<String, Integer> m2 = new HashMap<>();
        m2.put("a", 3);
        m2.put("c", 10);

        System.out.println(m1);
        System.out.println(m2);

        //iterate over second map and merge its elements into map 1 using
        //same key and sum of values
        m2.forEach((k, v) -> m1.merge(k, v, Integer::sum));

        System.out.println("===========");
        System.out.println(m1);
    }
}

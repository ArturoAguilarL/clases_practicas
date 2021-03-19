package demo;

import java.util.Map;
import java.util.TreeMap;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> m = new TreeMap<>();
        m.put("uno", 1);
        m.put("dos", 2);
        m.put("tres", 3);
        m.put("cuatro", 4);

        int x = m.get("tres");
        System.out.println(x);

        for (Map.Entry<String, Integer> e : m.entrySet()) {
            String k = e.getKey();
            int v = e.getValue();

            System.out.println(k + "=" + v);
        }


    }
}

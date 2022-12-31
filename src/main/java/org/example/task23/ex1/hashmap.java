package org.example.task23.ex1;

import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        map.put("Самойлов", "Егор");
        map.put("Крылов", "Кирилл");
        map.put("Порошин", "Илья");
        map.put("Сазонов", "Артем");
        map.put("Прокопчук", "Елизавета");
        map.put("Бабурин", "Артем");
        map.put("Самойлов", "Марк");
        map.put("Егорова", "Елизавета");
        map.put("Дронов", "Никита");
        for (String key: map.keySet()) {
            int count = 0;
            String value = map.get(key);
            if (!map2.containsValue(value)) {
                Iterator<String> it = map.values().iterator();
                while (it.hasNext()) {
                    String str = it.next();
                    if (str.equals(value)) {
                        count += 1;
                    }
                }
                if (count == 1) {
                    map2.put(key, value);
                }
            }
        }

        System.out.println(map);
        System.out.println(map2);
        Set<Object> uniqueValues = new HashSet<Object>(map.values());
        System.out.println(uniqueValues);
    }
}

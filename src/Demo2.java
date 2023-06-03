import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {

    public static void main(String[] args) {

        Map<String, String> phones = new HashMap<>();
        phones.put("Tomek", "576-234-367");
        phones.put("Alicja", "234-765-987");
        phones.put("Tomek", "999-999-999");
        phones.put("Barbara", "999-999-999");

        System.out.println(phones);

        Set<String> keys = phones.keySet();
        System.out.println(keys);

        System.out.println(phones.containsKey("Alicja"));
        System.out.println(phones.containsKey("Marcin"));

        System.out.println(phones.get("Alicja"));
        System.out.println(phones.get("Karol"));

        System.out.println();

        for (String key : phones.keySet()) {
            System.out.println(key + " -> " + phones.get(key));
        }

        System.out.println();

        for (String value : phones.values()) {
            System.out.println(value);
        }

        System.out.println();

        for(Map.Entry entry : phones.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            entry.setValue("0");
        }
        System.out.println();
        System.out.println(phones);
    }
}

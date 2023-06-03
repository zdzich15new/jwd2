import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo3 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("bbb");
        list.add("ccc");

        System.out.println(Collections.frequency(list, "bbb"));

        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}

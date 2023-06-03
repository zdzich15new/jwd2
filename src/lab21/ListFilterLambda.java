package lab21;

import java.util.ArrayList;
import java.util.List;

public class ListFilterLambda {

    public static void main(String[] args) {
        showDivisibleBy3(prepareIntegerList());
    }

    public static List<Integer> prepareIntegerList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            list.add(i);
        }
        return list;
    }

    public static void showDivisibleBy3(List<Integer> list) {
        list.forEach(i -> {if (i % 3 == 0) System.out.println(i);});
    }
}

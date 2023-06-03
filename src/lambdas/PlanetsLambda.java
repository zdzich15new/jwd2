package lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class PlanetsLambda {

    public static void main(String[] args) {
        String[] planets = {"Slonce", "Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};

        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };

        Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length();

        Arrays.sort(planets, (o1, o2) -> o1.length() - o2.length());
        Arrays.asList(planets).forEach(s -> System.out.println(s));

        System.out.println(Arrays.toString(planets));
    }
}

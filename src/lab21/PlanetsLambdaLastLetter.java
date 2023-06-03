package lab21;

import java.util.Arrays;
import java.util.Comparator;

public class PlanetsLambdaLastLetter {

    public static void main(String[] args) {
        String[] planets = {"Slonce", "Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};

        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        // first way

//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.charAt(o1.length()-1) - o2.charAt(o2.length()-1);
//            }
//        };
//
//        Arrays.sort(planets, comparator);

        // second way

        Arrays.sort(planets, (o1, o2) -> o1.charAt(o1.length()-1) - o2.charAt(o2.length()-1));

        System.out.println(Arrays.toString(planets));
        Arrays.asList(planets).forEach(s -> System.out.println(s));
    }
}

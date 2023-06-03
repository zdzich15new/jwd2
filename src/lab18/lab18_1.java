package lab18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.*;

public class lab18_1 {

    public static List<String> readBookLines(String filePath) {

        List<String> bookLinesList = null;

        try {
            bookLinesList = Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            System.out.println("Cos poszlo nie tak przy wczytywaniu pliku: " + e.getMessage());;
        }
        return bookLinesList;
    }

    public static int getBookLinesSize(List<String> bookLinesList) {
        return bookLinesList.size();
    }

    public static void getEach100Line(List<String> bookLinesList) {
        for (int i = 0; i < getBookLinesSize(bookLinesList); i++) {
            if (i % 100  == 0) {
                System.out.println("Wiesz numer - " + i + ": " + bookLinesList.get(i));
            }
        }
    }

    public static void showAllLines(List<String> bookLinesList) {
        for (int i = 0; i < getBookLinesSize(bookLinesList); i++) {
            System.out.println(bookLinesList.get(i));
        }
    }

//    public static Map<Integer, Integer> getLongestLine(List<String> bookLinesList) {
//        Map<String, Integer> mapLinesLegth = new HashMap<>();
//
//        for (int i = 0; i <= getBookLinesSize(bookLinesList) - 1; i++) {
//            mapLinesLegth.put(bookLinesList.get(i), bookLinesList.get(i).length());
//        }
//
//        List<Integer> bookLinesLengthsValues = new ArrayList<>(mapLinesLegth.values());
//
////        Collections.sort(mapLinesLegth.values());
////
////        bookLinesLengthsValues.get(0);
////
////
////        System.out.println(mapLinesLegth.get(bookLinesLengthsValues.get(0)));
////        return null;
//    }

    public static void showTheLongestVerse(List<String> bookLinesList) {
        String longestLine = "";

        for(String line: bookLinesList) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }

        System.out.println("Najdluzszy wiersz w ksiazce zawiera " + longestLine.length() + " znaki/znaków - " + longestLine.toUpperCase());
    }


    public static void main(String[] args) {

        List<String> bookLinesList;

        bookLinesList = readBookLines("src/lab18/crsto10.txt");

        showAllLines(bookLinesList);

        System.out.println();

        System.out.println(getBookLinesSize(bookLinesList));

        System.out.println();

        getEach100Line(bookLinesList);

        System.out.println();

        showTheLongestVerse(bookLinesList);

    }
}

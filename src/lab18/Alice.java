package lab18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Alice {

    public static void main(String[] args) {
        List allLines = loadTextFile("src/lab18/alice30.txt");

        Set words = divideIntoWordsAndClean(allLines);

        Map<Character, Integer> startLetterStats = createStartLetterStats(words);
        Map.Entry<Character, Integer> startLetterEntry = findStartLetter(startLetterStats);

//        System.out.println(allLines);
//
//        showAllLines(allLines);

        System.out.println("Liczba roznych wyrazow w ksiazce: " + words.size() + ".");

        System.out.println(words);

        System.out.println(startLetterStats);

        System.out.println("Litera na ktora zaczyna sie najwiecej wyrazow to \"" + startLetterEntry.getKey() + "\", jest ich " + startLetterEntry.getValue() + ".");
    }

    public static List loadTextFile(String textFileName) {
        try {
            return Files.readAllLines(Paths.get(textFileName));
        } catch (IOException e) {
            System.out.println("Cos poszlo nie tak przy wczytywaniu pliku: " + e.getMessage());;
        }
        return null;
    }

    public static void showAllLines(List<String> allLines) {
        for (int i = 0; i < allLines.size(); i++) {
            System.out.println(allLines.get(i));
        }
    }

    public static Set divideIntoWordsAndClean(List<String> allLines) {
        Set words = new TreeSet();

        for (String line : allLines) {
            String[] lineWords = line.split(" |--");
            for (String word : lineWords) {
                word = cleanWord(word);
                if (!word.isEmpty()) {
                    words.add(word.toLowerCase());
                }
            }
        }
        return words;
    }

    private static String cleanWord(String word) {
//        word.replace(", ", "").replace("(", "");
        return word.replaceAll("\\p{Punct}|\\d", "");
    }

    private static Map<Character, Integer> createStartLetterStats(Set<String> words) {
        Map<Character, Integer> startLetterStats = new TreeMap<>();
        for (String word : words) {
            Character startLetter = word.charAt(0);
            if (startLetterStats.containsKey(startLetter)) {
                startLetterStats.put(startLetter, startLetterStats.get(startLetter) + 1);
            } else {
                startLetterStats.put(startLetter, 1);
            }
        }
        return startLetterStats;
    }

    public static Map.Entry<Character, Integer> findStartLetter(Map<Character, Integer> startLetterStats) {
        Map.Entry<Character, Integer> startLetterEntry = null;
        for (Map.Entry<Character, Integer> entry : startLetterStats.entrySet()) {
            if (startLetterEntry == null|| entry.getValue() > startLetterEntry.getValue()) {
                startLetterEntry = entry;
            }
        }

        return startLetterEntry;
    }
}

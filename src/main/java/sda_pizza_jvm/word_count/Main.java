package sda_pizza_jvm.word_count;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {


    private static Map<String, Integer> counter;
    private static String PANTADEUSZFILE = "c:\\Users\\Jakub\\IdeaProjects\\sdapizzajvm\\pan-tadeusz.txt";

    public static void main(String[] args) throws FileNotFoundException {
        counter = new HashMap<>();


        File file = new File(PANTADEUSZFILE);

        Scanner scanner = new Scanner(file);

        String word;

        while (scanner.hasNext()) {

            word = scanner.next();
            word = word.replace(".", "");
            word = word.replace(",", "");
            word = word.replace("!", "");
            word = word.replace("?", "");
            word = word.replace("(", "");
            word = word.replace(")", "");
            word = word.replace(":", "");
            word = word.replace(";", "");
            word = word.replace("\";", "");
            word = word.replace("'", "");
            word = word.replace("-", "");
            word = word.replace("«", "");
            word = word.replace("»", "");
            word = word.replace("…", "");
            word = word.replace("*", "");
            word = word.replace("—", "");
            //System.out.println(word);

            count(word);

        }

        print();

    }


    private static void print() {

        counter
                .entrySet()
                .stream()
//                .sorted(Comparator.comparing(Map.Entry::getValue))
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .forEach(w -> System.out.println(String.format("%20s : %5d", w.getKey(), w.getValue())));


        System.out.println("\nsłów: "+counter.size());

    }

    private static void count(String word) {

        word = word.toLowerCase();

        if (word.isEmpty())
            return;

        if (counter.containsKey(word)) {
            Integer cnt = counter.get(word);
            counter.replace(word, cnt + 1);
        } else {
            if (word.length()>4)
                counter.put(word, 1);
        }
    }

}

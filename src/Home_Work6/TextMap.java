package Home_Work6;

import Home_Work6.Api.ISearchEngine;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static Home_Work6.TextSet.CountWords;
import static Home_Work6.TextSet.readFile;

public class TextMap {
    public static void main(String[] args) {
        /**
         * Задание 2.2
         */
        System.out.println("Задайте значение 'N': ");
        Scanner values = new Scanner(System.in);
        int n = values.nextInt();
        String text = "Home_Work6/Books/Война и мир_книга.txt";
        String book = null;
        try {
            book = readFile(text, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (book != null) {
            int count = CountWords(book);
            Map<String, Integer> hashMap = new HashMap<>();
            String[] words = book.split("[^а-я]+");
            for (String word : words) {
                if (hashMap.containsKey(word))
                    hashMap.put(word, hashMap.get(word) + 1);
                else
                    hashMap.put(word, 1);
            }
            List<Map.Entry<String, Integer>> Words = new ArrayList<>(hashMap.entrySet());
            Words.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
            for (int i = 0; i < n && i < Words.size(); i++) {
                Map.Entry<String, Integer> wordList = Words.get(i);
                System.out.println("Слово (" + wordList.getKey() + ") встречается " + wordList.getValue() + " раз.");
            }
            /**
             * Задание 5.1
             */
            System.out.println();
            System.out.println("Поиск повторений слов :\"война\", \"и\", \"мир\" ");
            System.out.println();
            ISearchEngine Looking = new EasySearch();
            List<String> WordsLook = Arrays.asList("война", "и", "мир");
            for (String word : WordsLook) {
                long counts = Looking.search(book.toString(), word);
                System.out.println("Слово (" + word + ") встречается " + counts + " раз");
            }
            /**
             * Задание 5.2
             */
            System.out.println("Поиск повторений слов :\"война\", \"и\", \"мир\" ");
            System.out.println();
            ISearchEngine Looking2 = new SearchEngineWithoutRegister(new RegExSearch());
            List<String> WordsLook2 = Arrays.asList("война", "и", "мир");
            for (String word : WordsLook2) {
                long counts = Looking2.search(book.toString(), word);
                System.out.println("Слово (" + word + ") встречается " + counts + " раз");
            }
        }
    }
}




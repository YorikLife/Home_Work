package Home_Work6;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TextSet {
    public static String readFile(String path, Charset encoding) throws IOException {
        String book;
        try (Scanner scanner = new Scanner(new File(path), String.valueOf(encoding))) {
            book = scanner.useDelimiter("\\A").next();
        }
        return book;
    }

    /**
     * Читаем файл txt.
     */
    public static void main(String[] args) {
        String filePath = "Home_Work6/Books/Война и мир_книга.txt";
        String book = null;
        try {
            book = readFile(filePath, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (book != null) {
            int count = CountWords(book);
            System.out.println("Слов в тексте: " + count);
        }
    }

    /**
     * Разделяем знаки и слова.
     */
    public static String[] splitStrings(String s) {
        Set<String> Words = new HashSet<>();
        String ex = ("[^а-я]+");
        return s.trim().split(ex);
    }

    /**
     * @param s - Текст.
     */
    public static int CountWords(String s) {
        Set<String> Words = new HashSet<>();
        String[] WordsArray = TextSet.splitStrings(s);
        for (String setWords : WordsArray) {
            Words.add(setWords);
        }
        return Words.size();
    }
}

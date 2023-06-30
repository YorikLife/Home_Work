package Home_Work6;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class BooksSearch {
    public static void main(String[] args) throws IOException {

        Scanner select = new Scanner(System.in);
        System.out.println("Введите адрес папки, для поиска книг : ");
        System.out.println();
        String PathDirectory = select.nextLine();  // "Home_Work6/Books/"
        System.out.println();
        if (PathDirectory.isEmpty()){
            return;
        }
        do {
            System.out.println("Список доступных книг : " );
            System.out.println();
            File FileFromDir = new File(PathDirectory);
            File[] files = FileFromDir.listFiles();
            for (File file : files) {
                System.out.println(file.getName());
            }
            System.out.println();
            System.out.println("Выбирите книгу из списка, согласно регистра : (Для выхода - нажмите Enter!");
            String fileSelect = select.nextLine();
            if (fileSelect.isEmpty()) {
                break;
            }
            String SelectResult = PathDirectory + "/" + fileSelect;
            File file = new File(SelectResult);
            StringBuilder TextBuilder = new StringBuilder();
            try (BufferedReader ReaderForText = new BufferedReader(new FileReader(file, Charset.forName("Cp866")))) {
                String text;
                while ((text = ReaderForText.readLine()) != null) {
                    TextBuilder.append(text).append(" ");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String View = TextBuilder.toString();
            do {
                System.out.println("Введите слово для поиска : ");
                String LookWord = select.nextLine();
                EasySearch LoooksWords = new EasySearch();
                System.out.println(LoooksWords.search(View, LookWord));
                String ForReport = fileSelect + " - " + LookWord + " - " + LoooksWords.search(View, LookWord) + "\n";
                String result = ForReport;
                System.out.println(result);
                File report = new File("Home_Work6/result.txt");
                long countWords = LoooksWords.search(TextBuilder.toString(), LookWord);
                try (Writer writer = new FileWriter(report, true)) {
                    writer.write(file + " - " + "\n");
                    writer.write("Слово : (" + LookWord + ") Встречается - " + countWords + " раз " + "\n");
                    System.out.println();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Продолжить поиск? (0) - выход, для выбора файла из списка.");
                String selectValue = select.nextLine();
                if (selectValue.equals("да")) {
                    continue;
                }
                if (selectValue.equals("0")) {
                    break;
                }
                if (selectValue.equals("нет")) {
                    try {
                    } catch (RuntimeException e) {
                    throw new RuntimeException(e);
                }
                    System.out.println("До скорых встреч!");
                    System.out.println("Отчет о количестве и содержимом поиска - сохранён в result.txt ");
                    break;
                }
            } while (true);
        } while (true);
    }
}
























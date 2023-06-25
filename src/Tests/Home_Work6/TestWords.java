package Tests.Home_Work6;

import Home_Work6.Api.ISearchEngine;
import Home_Work6.EasySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWords {
    @Test
    public void test1() {
        ISearchEngine LookingForWords = new EasySearch();
        String text = "бабушка бабушке бабушку";
        long actual = LookingForWords.search(text, "бабу");
        long expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        ISearchEngine LookingForWords = new EasySearch();
        String text = "как дела!.Что делаешь?";
        long actual = LookingForWords.search(text, "как");
        long expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        ISearchEngine LookingForWords = new EasySearch();
        String text = "Мама мыла раму";
        long actual = LookingForWords.search(text, "привет");
        long expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void test4() {
        ISearchEngine LookingForWords = new EasySearch();
        String text = "Все скороговорки не перескороговоришь и не перевыскороговоришь!";
        long actual = LookingForWords.search(text, "скороговорка");
        long expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void test5() {
        ISearchEngine LookingForWords = new EasySearch();
        String text = "";
        long actual = LookingForWords.search(text, "Привет, Илья!)");
        long expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void test6() {
        ISearchEngine LookingForWords = new EasySearch();
        String text = "ну блииин, сказал слон, наступив на колобка...";
        long actual = LookingForWords.search(text, "блииин");
        long expected = 1;
        assertEquals(expected, actual);
    }
}

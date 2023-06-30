package Tests.Home_Work6;

import Home_Work6.*;
import Home_Work6.Api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
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
    @Test
    public void test7() {
        ISearchEngine Looks = new RegExSearch();
        String text = "мама рама буря";
        long actual = Looks.search(text, "буря");
        long expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test8() {
        ISearchEngine Looks = new RegExSearch();
        String text = "Мама мыла раму";
        long actual = Looks.search(text , "раму");
        long expected = 1;
        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void test9() {
        ISearchEngine Looks = new RegExSearch();
        String text = "Мама мыла раму, Рама МЫЛИ Маму";
        long actual = Looks.search(text , "МЫЛИ");
        long expected = 1;
        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void test10() {
        ISearchEngine Looks = new SearchEnginePunctuationNormalizer(new RegExSearch());
        String text = "Мама мыла раму, Раму МЫЛИ Маме";
        long actual = Looks.search(text , "Маме");
        long expected = 1;
        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void test11() {
        ISearchEngine Looks = new SearchEngineWithoutRegister(new RegExSearch());
        String text = "Мама мыла раму, Раму МЫЛИ Маме";
        long actual = Looks.search(text , "мыли");
        long expected = 1;
        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void test12() {
        ISearchEngine Looks = new SearchEngineCaseNormalizer(new RegExSearch());
        String text = "бабушками бабушкаю бабушках";
        long actual = Looks.search(text , "бабушка");
        long expected = 3;
        Assertions.assertEquals(expected , actual);
    }
}

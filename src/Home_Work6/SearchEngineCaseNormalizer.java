package Home_Work6;

import Home_Work6.Api.ISearchEngine;

import java.util.Arrays;
import java.util.List;

public class SearchEngineCaseNormalizer implements ISearchEngine {
    private ISearchEngine searcher;
    public SearchEngineCaseNormalizer(ISearchEngine searcher) {
        this.searcher = searcher;
    }
    @Override
    public long search(String text, String word) {
        List<String> endsOfWords = Arrays.asList("а", "у", "е", "ой", "ая", "ы", "и", "ек", "ов", "ев", "ёв", "ам", "ям",
                "ом", "ём", "ем", "ею", "ёю", "ах", "ях", "ок", "ек", "о", "ами", "ями","оми", "ёми","ов", "" );
        int remove = 0;
        for (String str : endsOfWords) {
            if(str.endsWith(word)) remove = str.length();
        }
        String s;
        s = word.substring(0, word.length() - remove) + "(?U)[А-я]{0,3}";
        return searcher.search(text, s);
    }
}

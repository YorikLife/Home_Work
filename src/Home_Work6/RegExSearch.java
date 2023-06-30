package Home_Work6;

import Home_Work6.Api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        Pattern pattern = Pattern.compile("(?U)\\b" + word + "(?U)\\b");
        Matcher matcher = pattern.matcher(text);
        int CountWords = 0;
        while (matcher.find()) {
            CountWords++;
        }
        return CountWords;
    }
}

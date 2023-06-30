package Home_Work6;

import Home_Work6.Api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        long count = 0;
        int index = text.indexOf(word);
        while (index > -1) {
            count++;
            index = text.indexOf(word, index + 1);
        }
        return count;
    }
}

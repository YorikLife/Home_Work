package Home_Work6;

import Home_Work6.Api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine punctuation;
    public SearchEnginePunctuationNormalizer(ISearchEngine punctuation) {
       this.punctuation = punctuation;
    }

    @Override
    public long search(String text, String word) {
        String TextPunct = text.replaceAll("[\\p{Punct}\\s&&[^\\h]]","");
        return punctuation.search(TextPunct, word);
    }
}

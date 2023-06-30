package Home_Work6;

import Home_Work6.Api.ISearchEngine;

public class SearchEngineWithoutRegister implements ISearchEngine {
    private ISearchEngine searchEngineRegister;
    public SearchEngineWithoutRegister(ISearchEngine searchEngineRegister) {
        this.searchEngineRegister = searchEngineRegister;
    }

    @Override
    public long search(String text, String word) {
        return searchEngineRegister.search(text.toLowerCase(), word.toLowerCase());
    }
}

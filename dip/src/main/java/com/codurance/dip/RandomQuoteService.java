package com.codurance.dip;

import java.util.List;
import java.util.Random;

public class RandomQuoteService {

    // So kann man keine andere Implementierung machen, stark von FileQuoteList anhängig
    // private final FileQuoteList quote = new FileQuoteList();

    private final IQuoteList quote;

    public RandomQuoteService(IQuoteList quote) {
        this.quote = quote;
    }

    public String getRandomQuote() {
        List<String> quoteList = quote.getQuoteList();
        Random random = new Random();
        int index = random.nextInt(quoteList.size());
        return quoteList.get(index);
    }
}

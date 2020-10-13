package com.codurance.dip;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class RandomQuoteServiceTest {

    @Mock
    private IQuoteList list;

    @Before
    public void setUp(){
        given(list.getQuoteList()).willReturn(List.of("This is my mock"));
    }

    @Test
    public void getRandomQuote() {
        RandomQuoteService randomQuoteService = new RandomQuoteService(list);
        assertEquals(randomQuoteService.getRandomQuote(), "This is my mock");
    }
}
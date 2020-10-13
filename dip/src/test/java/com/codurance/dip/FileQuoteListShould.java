package com.codurance.dip;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FileQuoteListShould {

    @Test
    public void get_random_quote_size() {
        FileQuoteList engineer = new FileQuoteList();
        assertThat(engineer.getQuoteList().size()).isEqualTo(6);
    }
}
package com.avl.hangman;

import java.util.ArrayList;
import java.util.List;

public class WordList {
    private final List<String> words;

    public WordList() {
        words = new ArrayList<>();
        words.add("apple");
        words.add("orange");
        words.add("banana");
        words.add("lemon");
        words.add("grapes");
        words.add("pineapple");
    }

    public String getRandomWord() {
        int randomIndex = (int) (Math.random() * words.size());
        return words.get(randomIndex);
    }
}

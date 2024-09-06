package com.avl.hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordList {
    private final List<String> words;
    private final Random random;

    public WordList() {
        words = new ArrayList<>();
        random = new Random();
        words.add("apple");
        words.add("orange");
        words.add("banana");
        words.add("lemon");
        words.add("grapes");
        words.add("pineapple");
    }

    public String getRandomWord() {
        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }
}

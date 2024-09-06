package com.avl.hangman;

import java.util.ArrayList;
import java.util.List;

public class GamePlay implements Playable {

    private String word;
    private List<Character> currentWordState;
    private int remainingAttempts;
    private final WordList wordList;

    public GamePlay(WordList wordList) {
        this.wordList = wordList;
        this.remainingAttempts = 6;
    }

    @Override
    public void start() {
        word = wordList.getRandomWord();
        currentWordState = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            currentWordState.add('_');
        }
        System.out.println("The game has started! Guess the word: " + getCurrentWordState());
    }

    @Override
    public boolean guessLetter(char letter) {

        if (currentWordState.contains(letter)) {
            System.out.println("You've already guessed the letter.");
            return true;
        }

        boolean isCorrectGuess = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                currentWordState.set(i, letter);
                isCorrectGuess = true;
            }
        }
        if (!isCorrectGuess) {
            remainingAttempts--;
        }
        return isCorrectGuess;
    }

    @Override
    public boolean isGameOver() {
        return isWordGuessed() || remainingAttempts <= 0;
    }

    @Override
    public boolean isWordGuessed() {
        return !currentWordState.contains('_');
    }

    @Override
    public String getCurrentWordState() {
        StringBuilder currentState = new StringBuilder();
        for (Character c : currentWordState) {
            currentState.append(c).append(' ');
        }
        return currentState.toString().trim();
    }

    @Override
    public int getRemainingAttempts() {
        return remainingAttempts;
    }
}
package com.avl.hangman;

public interface Playable {

    void start();

    boolean guessLetter(char letter);

    boolean isGameOver();

    boolean isWordGuessed();

    String getCurrentWordState();

    int getRemainingAttempts();

}
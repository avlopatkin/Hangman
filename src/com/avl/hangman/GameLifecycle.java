package com.avl.hangman;

public interface GameLifecycle {
    void startGame();
    void stopGame();
    boolean isGameRunning();
}
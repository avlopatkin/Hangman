package com.avl.hangman;

public class GameController implements GameControllerInterface{
    private boolean isRunning;

    public GameController() {
        this.isRunning = false;
    }

    @Override
    public void startGame() {
        isRunning = true;
        System.out.println("Game started");
    }

    @Override
    public void stopGame() {
        isRunning = false;
        System.out.println("Game stopped");
    }

    @Override
    public boolean isGameRunning() {
        return isRunning;
    }
}

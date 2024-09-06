package com.avl.hangman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        WordList wordList = new WordList();
        GamePlay game = new GamePlay(wordList);
        GameRunner gameController = new GameRunner();

        gameController.startGame();
        game.start();

        Scanner scanner = new Scanner(System.in);

        while (gameController.isGameRunning()) {
            System.out.println("Please enter a char: ");
            char guessedLetter = scanner.next().charAt(0);
            boolean isCorrect = game.guessLetter(guessedLetter);

            System.out.println("Current word status: " + game.getCurrentWordState());
            System.out.println("Remaining attempts: " + game.getRemainingAttempts());

            if (isCorrect) {
                System.out.println("You Guessed the letter!");
            } else {
                System.out.println("You Did Not Guessed the letter!");
            }

            if (game.isGameOver()) {
                if (game.isWordGuessed()) {
                    System.out.println("You Won! " + game.getCurrentWordState());
                } else {
                    System.out.println("You Lost! " + game.getCurrentWordState());
                }
                gameController.stopGame();
            }
        }
        scanner.close();
    }
}

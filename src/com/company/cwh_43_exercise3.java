package com.company;

import java.util.Scanner;

class Game {
    private final int numGenerated;
    private int numGuessed;
    Scanner sc;
    private int numOfGuesses;

    public int getNumOfGuesses() {
        return numOfGuesses;
    }

    public void setNumOfGuesses(int numOfGuesses) {
        this.numOfGuesses = numOfGuesses;
    }

    public Game() {
        this.numGenerated = (int)(Math.random()*100);
        this.numOfGuesses = 0;
        sc = new Scanner(System.in);
    }
    public void takeUserInput() {
        System.out.print("Enter a number: ");
        this.numGuessed = sc.nextInt();
    }
    public int isCorrectNumber() {
        if(this.numGuessed == this.numGenerated) {
            return 0;
        } else if (this.numGuessed < this.numGenerated) {
            System.out.println("Number guessed is smaller");
            return 1;
        } else {
            System.out.println("Number guessed is greater");
            return -1;
        }
    }

}
public class cwh_43_exercise3 {
    public static void main(String[] args) {
        Game game = new Game();
        do {
            game.takeUserInput();
            game.setNumOfGuesses(game.getNumOfGuesses() + 1);
        } while (game.isCorrectNumber() != 0);
        System.out.println("You guessed the number in " + game.getNumOfGuesses() + " guesses");
    }
}

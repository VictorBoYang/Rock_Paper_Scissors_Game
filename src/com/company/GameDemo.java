package com.company;

import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
        boolean x = true;
        while(x){
        String user_choice,user_answer;
        Game_Funtions test_game = new Game_Funtions();
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter your choice(rock, paper, or scissors): ");
                user_choice = input.nextLine();
                if (user_choice.equalsIgnoreCase("paper") ||
                        user_choice.equalsIgnoreCase("rock") ||
                        user_choice.equalsIgnoreCase("scissors")) {
                    break;
                } else {
                    System.out.println("invalid choice. Please try again");
                }
            } catch (Exception e) {
            }
        }
        test_game.getRPS();
        String result = test_game.whoWon(user_choice);
        switch (result){
            case "user":
                System.out.println("You win!");
                break;
            case "computer":
                System.out.println("You lose!");
                break;
            case "tie":
                System.out.println("It's a tie!");
                break;
        }
        try{
            System.out.println("Would you like to play again? (Y for yes, N for no):");
            user_answer = input.nextLine();
            switch (user_answer){
                case "Y":
                case "y":
                    continue;
                case "N":
                case "n":
                    x = false;
                    break;
            }
        }catch (Exception e){
        }
    }
    }
}

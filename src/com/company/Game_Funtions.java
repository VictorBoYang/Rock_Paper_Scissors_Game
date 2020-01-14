package com.company;

import java.util.Random;



public class Game_Funtions {
    private Random rGen;
    private String cpuChoice;

    Game_Funtions(){
        rGen = new Random();
        cpuChoice = "";
    }

    public String getRPS(){
        int cpu_choice_int = rGen.nextInt(3) + 1;
        if(cpu_choice_int == 1) {
            cpuChoice = "rock";
        }
        else if(cpu_choice_int == 2){
            cpuChoice = "paper";
        }
        else if(cpu_choice_int == 3){
            cpuChoice = "scissors";
        }
        return cpuChoice;
    }

    public String whoWon(String user_choice){
        String result = null;
        if(user_choice.equalsIgnoreCase("rock")){
            if(cpuChoice.equalsIgnoreCase("rock")){
                result = "tie";
            }
            else if(cpuChoice.equalsIgnoreCase("paper")){
                result = "computer";

            }
            else if(cpuChoice.equalsIgnoreCase("scissors")){
                result = "user";

            }
        }
        else if(user_choice.equalsIgnoreCase("paper")){
            if(cpuChoice.equalsIgnoreCase("paper")){
                result = "tie";

            }
            else if(cpuChoice.equalsIgnoreCase("scissors")){
                result = "computer";

            }
            else if(cpuChoice.equalsIgnoreCase("rock")){
                result = "user";

            }
        }
        else if(user_choice.equalsIgnoreCase("scissors")){
            if(cpuChoice.equalsIgnoreCase("scissors")){
                result = "tie";

            }
            else if(cpuChoice.equalsIgnoreCase("rock")){
                result = "computer";

            }
            else if(cpuChoice.equalsIgnoreCase("paper")){
                result = "user";

            }
        }
        return result;
    }
}

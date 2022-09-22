package Projects;
import java.util.Random;
import java.util.Scanner;

class Rock_Paper_Scissors {
    public static void main(String[] args) {
        
        // Build a rock-paper-scissor method
        // 0 -> Rock
        // 1 -> Paper
        // 2 -> Scissor

        Scanner input = new Scanner(System.in);
        int user_input, comp_input;
        int user_score = 0;
        int comp_score = 0;

        // Playing the game 5 times
        for(int i = 1; i <= 5; i++){
            String user_inp = "";
            String comp_inp = "";

            // User Input
            System.out.println("Your Score: " + user_score);
            System.out.println("Computer Score: " + comp_score);
            System.out.println("Enter your number\n0 for 'Rock', 1 for 'Paper', 2 for 'Scissor'");
            user_input = input.nextInt();
            if(user_input == 0){
                System.out.println("Rock");
                user_inp += "Rock";
            }
            else if(user_input == 1){
                System.out.println("Paper");
                user_inp += "Paper";
            }
            else if(user_input == 2){
                System.out.println("Scissor");
                user_inp += "Scissor";
            }
            else{
                System.out.println("Invalid Input. Try again");
                continue;
            }

            // Computer Input
            Random rand = new Random();
            System.out.println("Computer's turn: ");
            comp_input = rand.nextInt(3);
            if(comp_input == 0){
                System.out.println("Rock");
                comp_inp += "Rock";
            }
            else if(comp_input == 1){
                System.out.println("Paper");
                comp_inp += "Paper";
            }
            else if(comp_input == 2){
                System.out.println("Scissor");
                comp_inp += "Scissor";
            }

            // Deciding the winner based on the input
            // Case where user is the winner
            if((user_inp.equals("Rock") && comp_inp.equals("Scissor")) || 
            (user_inp.equals("Scissor") && comp_inp.equals("Paper")) ||
            (user_inp.equals("Paper") && comp_inp.equals("Rock"))){
                System.out.println("You win");
                user_score ++;
            }

            // Case where Computer is the winner
            else if((comp_inp.equals("Rock") && user_inp.equals("Scissor")) || 
            (comp_inp.equals("Scissor") && user_inp.equals("Paper")) ||
            (comp_inp.equals("Paper") && user_inp.equals("Rock"))){
                System.out.println("Computer wins");
                comp_score ++;
            }

            // Case where it is a tie
            else if((comp_inp.equals("Rock") && user_inp.equals("Rock")) || 
            (comp_inp.equals("Scissor") && user_inp.equals("Scissor")) ||
            (comp_inp.equals("Paper") && user_inp.equals("Paper"))){
                System.out.println("It's a tie");
                comp_score += 0;
                user_score += 0;
            }
        }

        // Winner
        System.out.println("Your Score: " + user_score);
        System.out.println("Computer's Score: " + comp_score);
        if(user_score > comp_score){
            System.out.println("Congratulations! You are the winner");
        }
        else if(comp_score > user_score){
            System.out.println("Sorry! Computer is the winner");
        }
        else{
            System.out.println("It is a tie!");
        }
        

        input.close();
    }    
}

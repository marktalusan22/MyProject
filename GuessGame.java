import java.util.*;
public class GuessGame{
    public static void main(String Mark []){
        
        Scanner input = new Scanner(System.in);
        Random made = new Random();
        
        int rand = made.nextInt(100) + 1;
        int guess = 0;
        
        while(guess != rand){
            System.out.print("Guess a number from 1-100: ");
            guess = input.nextInt();
            
            if(guess == rand){
                System.out.println("\nCongrats! :DD");
            }else if(guess > rand){
                System.out.println("Guess is too high! :< ");
            }else{
                System.out.println("Guess is too low! :<<");
            }
        }
    }
}
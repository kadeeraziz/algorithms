import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100); 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");

        int guess = -1;
        
        while(guess != number){
            guess = input.nextInt();

            if (guess > number){
                System.out.println("Too high, please choose a smaller number");
            }
            else if (guess < number){
                System.out.println("Too samall, please select a high number");
            } else {
                System.out.println("You guessed it right");
            }
        }

        input.close();
    }

    
}

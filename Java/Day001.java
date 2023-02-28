package Java;

import java.security.SecureRandom;

public class Day001 {
    
    public static final SecureRandom random = new SecureRandom();
    public static void main(String[] args) {
       
        System.out.println("Generating 10 random numbers between 50 and 100");
        for(int i=0; i<10; i++){
            System.out.println(getRandomNumber(50, 100));
        }

    }

    private static int getRandomNumber(int min, int max){
        return random.nextInt(max - min + 1) + min;
    }

}

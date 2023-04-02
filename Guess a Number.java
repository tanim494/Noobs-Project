import java.util.Scanner;


public class encrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tries = 0;
        System.out.println("Enter Limit: ");
        int limit = sc.nextInt();
        System.out.printf("Guess Between 1 - %d:\n", limit);
        int cGuess = (int) ((Math.random() * limit) + 1);
        //System.out.println(cGuess);
        int uGuess = sc.nextInt();
        while (uGuess != cGuess) {
            tries++;
            if (cGuess > uGuess) {
                System.out.println("Number is Higher");
            } else {
                System.out.println("Number is Lower");
            }
            uGuess = sc.nextInt();
        }
        if (limit >= 1000 && tries < 5) {
            System.out.println("Great Job. Out of 1000 or more choices you guessed the correct one in less than 5 tries.");
        }
        System.out.printf("%d is Correct\nYou took %d tries",cGuess,tries+1);
    }
}

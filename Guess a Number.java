
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tries = 0;
        System.out.println("Enter Limit: ");
        int limit = sc.nextInt();
        System.out.printf("\nGuess Between 1 - %d:\n", limit);
        int cGuess = (int) ((Math.random() * limit) + 1);
        //System.out.println(cGuess);
        //System.out.println("Guess a Number: ");
        int uGuess = sc.nextInt();
        while(uGuess != cGuess) {
            tries++;
            if(cGuess > uGuess) {
                System.out.println("Number is Higher");
            } else {
                System.out.println("Number is Lower");
            }
            uGuess = sc.nextInt();
        }
        System.out.println("You took "+ ++tries + " tries");
    }
}

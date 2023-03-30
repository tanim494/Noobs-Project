import java.util.InputMismatchException;
import java.util.Scanner;

public class codeforces {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("|\t--Welcome--\t|\nChoose Option:\n1. Encrypt\n2. Decrypt\n3. Exit\n");
        int option = 0;
        boolean validOption = false;
        while (!validOption) {
            try {
                option = sc.nextInt();
                if (option == 1 || option == 2 || option == 3) {
                    validOption = true;
                }
            } catch (InputMismatchException e) {
                sc.nextLine(); // consume the invalid input
            }
            System.out.println("Invalid Input. Please Enter 1 2 3");
        }
        switch (option) {
            case 1:
                sc.nextLine();
                System.out.println("Enter The text you want to encrypt: ");
                String encInput = sc.nextLine();
                System.out.println("Here's the Encrypted text: \n" + encryptText(encInput));
                System.out.printf("1. Encrypt\n2.Decrypt\n3.Exit\n");
                validOption = false;
                while (!validOption) {
                    try {
                        option = sc.nextInt();
                        if (option == 1 || option == 2 || option == 3) {
                            validOption = true;
                        }
                    } catch (InputMismatchException e) {
                        sc.nextLine(); // consume the invalid input
                    }
                    System.out.println("Invalid Input. Please Enter 1 2 3");
                }

            case 2:
                sc.nextLine();
                System.out.println("Enter The text you want to decrypt: ");
                String decInput = sc.nextLine();
                System.out.println("Here's the Decrypted text: \n" + decryptText(decInput));
                System.out.printf("1. Encrypt\n2.Decrypt\n3.Exit\n");

                validOption = false;
                while (!validOption) {
                    try {
                        option = sc.nextInt();
                        if (option == 1 || option == 2 || option == 3) {
                            validOption = true;
                        }
                    } catch (InputMismatchException e) {
                        sc.nextLine(); // consume the invalid input
                    }
                    System.out.println("Invalid Input. Please Enter 1 2 3");
                }

            case 3:
                break;
        }
    }

    public static String encryptText(String input) {
        String output = input.replaceAll("a", "9");
        output = output.replaceAll("o", "1");
        output = output.replaceAll("t", "2");
        output = output.replaceAll("u", "3");
        output = output.replaceAll("n", "4");
        output = output.replaceAll("e", "5");
        output = output.replaceAll("r", "6");
        output = output.replaceAll("i", "7");
        output = output.replaceAll("s", "8");
        String encrypted = new StringBuilder(output).reverse().toString();
        return encrypted;
    }

    public static String decryptText(String encrypted) {
        String decrypted = new StringBuilder(encrypted).reverse().toString();
        decrypted = decrypted.replaceAll("9", "a");
        decrypted = decrypted.replaceAll("1", "o");
        decrypted = decrypted.replaceAll("2", "t");
        decrypted = decrypted.replaceAll("3", "u");
        decrypted = decrypted.replaceAll("4", "n");
        decrypted = decrypted.replaceAll("5", "e");
        decrypted = decrypted.replaceAll("7", "i");
        decrypted = decrypted.replaceAll("6", "r");
        decrypted = decrypted.replaceAll("8", "s");
        return decrypted;
    }
}

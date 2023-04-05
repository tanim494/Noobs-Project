import java.util.InputMismatchException;
import java.util.Scanner;
public class encrypt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("|\t--Welcome--\t|\n");
        int option = 0;

        while (true) {
            System.out.println("Choose Option:");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. Exit");
            try {
            option = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Option! Please choose a valid option.");
            }
            sc.nextLine(); // consume the newline character after the integer input

            if (option == 1) {
                System.out.println("Enter The text you want to encrypt: ");
                String text = sc.nextLine();
                String encryptedText = encrypt(text);
                System.out.println("Here's the Encrypted text: ");
                System.out.println(encryptedText);
            } else if (option == 2) {
                System.out.println("Enter The text you want to decrypt: ");
                String text = sc.nextLine();
                //String decryptedText = decrypt(text);
                System.out.println("Here's the Decrypted text: ");
                System.out.println(decrypt(text));
            } else if (option == 3) {
                break;
            } else {
                System.out.println("Enter | 1 | 2 | 3 |");
            }
        }
    }
    public static String encrypt(String inp) {
        inp = new StringBuilder(inp).reverse().toString();
        System.out.println(inp);
        String enc = "";
        for (int i = 0; i < inp.length(); i++) {
            char c = inp.charAt(i);
            switch (c) {
                case 'a' : enc += "Qwe6"; break;
                case 'b' : enc += "Oae9"; break;
                case 'c' : enc += "Tuf34"; break;
                case 'd' : enc += "We2e8"; break;
                case 'e' : enc += "In14"; break;
                case 'f' : enc += "M56v"; break;
                case 'g' : enc += "Z73x"; break;
                case 'h' : enc += "B30g0"; break;
                case 'i' : enc += "Kl04l"; break;
                case 'j' : enc += "Mn8o"; break;
                case 'k' : enc += "Lo7l"; break;
                case 'l' : enc += "He8y0"; break;
                case 'm' : enc += "Io2um"; break;
                case 'n' : enc += "Do4t"; break;
                case 'o' : enc += "Re677"; break;
                case 'p' : enc += "Kien0"; break;
                case 'q' : enc += "Mo12z"; break;
                case 'r' : enc += "St23"; break;
                case 's' : enc += "Niu4m"; break;
                case 't' : enc += "Zx85"; break;
                case 'u' : enc += "Pq4we"; break;
                case 'v' : enc += "Bo4y6"; break;
                case 'w' : enc += "Zr3i5"; break;
                case 'x' : enc += "O22h3"; break;
                case 'y' : enc += "Lk4i4"; break;
                case 'z' : enc += "Y2n4"; break;
                default: enc += c; break;
            }
        }
        return enc;
    }
    public static String decrypt (String inp) {
        inp = inp.replaceAll("Qwe6","a");
        inp = inp.replaceAll("Oae9","b");
        inp = inp.replaceAll("Tuf34","c");
        inp = inp.replaceAll("We2e8","d");
        inp = inp.replaceAll("In14","e");
        inp = inp.replaceAll("M56v","f");
        inp = inp.replaceAll("Z73x","g");
        inp = inp.replaceAll("B30g0","h");
        inp = inp.replaceAll("Kl04l","i");
        inp = inp.replaceAll("Mn8o","j");
        inp = inp.replaceAll("Lo7l","k");
        inp = inp.replaceAll("He8y0","l");
        inp = inp.replaceAll("Io2um","m");
        inp = inp.replaceAll("Do4t","n");
        inp = inp.replaceAll("Re677","o");
        inp = inp.replaceAll("Kien0","p");
        inp = inp.replaceAll("Mo12z","q");
        inp = inp.replaceAll("St23","r");
        inp = inp.replaceAll("Niu4m","s");
        inp = inp.replaceAll("Zx85","t");
        inp = inp.replaceAll("Pq4we","u");
        inp = inp.replaceAll("Bo4y6","v");
        inp = inp.replaceAll("Zr3i5","w");
        inp = inp.replaceAll("O22h3","x");
        inp = inp.replaceAll("Lk4i4","y");
        inp = inp.replaceAll("Y2n4","z");

        inp = new StringBuilder(inp).reverse().toString();
        return inp;
    }
}

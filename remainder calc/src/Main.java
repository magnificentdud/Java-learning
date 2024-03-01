// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k,n;
        k = input.nextInt();
        n = input.nextInt();
        while (k%n >= 3){

            System.out.println("k value is "+k);
            k = k/2;


        }
        System.out.println("final k value is "+k);

    }
}
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class ForLOOP {
    public static void main(String[] args) {
        sum10();

    }
    public static void sum10(){
        int total = 0;
        int num;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i<6; i++){
            System.out.println("Enter a number:");
            num = input.nextInt();
            total += num;
        }
        if (total>=100){
            for (int i=0;i<100;i++){
                System.out.println("Hundred Reached!");
            }
        } else if (total>=50){
            for (int i=0;i<50;i++){
                System.out.println("Fifty Reached!");
            }
        } else {
            System.out.println("The total is " + total);
        }

    }
}
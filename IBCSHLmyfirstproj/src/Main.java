// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      addTwo();
        displayBAI();

    }

    public static void addTwo(){
        Scanner kbin;
        kbin = new Scanner(System.in);

        int num1, num2, total;

        num1 = kbin.nextInt();
        num2 = kbin.nextInt();

        total = num1+num2;

        System.out.println("The total is:"+total);


    }
    //Task 1
    public static void displayBAI(){
        Scanner input;
        input = new Scanner(System.in);

        String name;
        double weight, height;
        System.out.println("input your name: ");
        name = input.nextLine();
        System.out.println("input your weight in kilograms");
        weight = input.nextDouble();
        System.out.println("input your height in meters");
        height = input.nextDouble();
        double BAI;
        BAI = weight/(height*height);
        System.out.println("The BAI of "+name+"is"+BAI);

    }
}
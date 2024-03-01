// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Summing {
    // Task 1
    public static void getAverage(){
        int nums;
        nums = 0;
        for (int i=0;i<100;i++){
            int num;
            num = (int)(Math.random()*100)+1;
            nums = nums + num;
            System.out.println("the number is "+num);


        }
        System.out.print("The average of 100 numbers is "+nums/100);
    }
    // Task 2
    public static void totalLength(){
        Scanner input = new Scanner(System.in);
        int totallen;
        totallen = 0;
        for (int i=0;i<5;i++){
            String animal;
            animal = input.nextLine();
            System.out.println("The length of " + animal+"is "+animal.length());
            totallen = totallen + animal.length();
        }
        System.out.print("The total length of the 5 animals is "+totallen);
    }
    // Task 3
    public static void sumPairs(){
        Scanner input = new Scanner(System.in);
        int total_first;
        total_first = 0;
        for (int i=0;i<5;i++){

            int num1, num2;
            num1 = (int)(Math.random()*10)+1;
            num2 = (int)(Math.random()*10)+1;
            if (num1+num2>10){
                total_first = total_first + num1;
            }
            System.out.println(num1);
            System.out.println(num2);

        }
        System.out.print("The total of first numbers is "+total_first);
    }
    public static void main(String[] args) {
//        getAverage();
//        totalLength();
//        sumPairs();


    }
}
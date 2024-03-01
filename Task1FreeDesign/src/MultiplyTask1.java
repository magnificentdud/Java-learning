// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class MultiplyTask1 {
    public static void main(String[] args){
        getValues();

    }

    public static void displayResult(int mul){
        System.out.print("the multiple of the two numbers is "+mul);
    }
    public static void multiply(int num1,int num2){
        int multiple;
        multiple = num1*num2;
        displayResult(multiple);

    }
    public static void getValues(){
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("input a random number");
        a = input.nextInt();
        System.out.println("input a random number");
        b = input.nextInt();
        multiply(a,b);

    }


}
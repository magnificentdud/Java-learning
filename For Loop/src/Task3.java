import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        displayMin();

    }
    public static void negative(){
        for (int i=0;i<10000;i++){
            System.out.println("It's a miracle!");
        }
    }
    public static void positive(){
        for (int i=0;i<5000;i++){
            System.out.println("So Predictable!!");
        }
    }
    public static void neutral(){
        System.out.print("Well I never!");
    }
    public static void displayMin(){
        Scanner input = new Scanner(System.in);

        int minnum;
        minnum = 2147483647;
        for (int i=0; i<1000; i++){
            System.out.println("Enter a number:");
            int num;
            num = input.nextInt();
            if (num<minnum) {
                minnum = num;
            }

        }

        System.out.println("The smallest number is "+minnum);
        if (minnum<0){
            negative();
        } else if (minnum>0){
            positive();
        } else if (minnum == 0){
            neutral();
        }
    }
}

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Love {

    public static void countLove(){
        int love, flowers, sunset, other;
        love = 0;
        flowers = 0;
        sunset = 0;
        other = 0;

        Scanner input = new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.println("Enter a love");
            String enter;
            enter = input.nextLine();
            if (enter.equals("love")){
                love = love +1;
            } else if (enter.equals("flowers")){
                flowers = flowers + 1;
            } else if (enter.equals("sunset")){
                sunset = sunset +1;
            } else{
                other = other + 1;
            }
        }
        System.out.println("The number of times love was entered is: "+love);
        System.out.println("The number of times flowers was entered is: "+flowers);
        System.out.println("The number of times sunset was entered is: "+sunset);
        System.out.println("The number of times other was entered is: "+other);

    }
    public static void languageStats(){
        Scanner input = new Scanner(System.in);
        int longwrd;
        longwrd = 0;
        for (int i=0;i<20;i++){
            System.out.println("input a word");
            String wrd;
            wrd = input.nextLine();
            if (wrd.length() > 7){
                longwrd = longwrd + 1;
            }
        }
        if (longwrd > 10){
            System.out.println("You have an impressive vocabulary!");
        } else{
            System.out.println("Thank you for participating.");
        }
    }
    public static void main(String[] args) {
//        countLove();
        languageStats();

    }
}
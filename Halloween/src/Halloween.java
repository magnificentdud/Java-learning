// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Halloween {
    public static void main(String[] args){
        Halloween();
    }
    public static void Halloween(){
        int choice;
        do{
            System.out.println("Input a number between 1 and 3 to play a game or input another number to exit");
            choice = getChoice();
            switch(choice){
                case 1:
                    boolean tricked = trickOrTreat();
                    if (tricked){
                        System.out.println("Tricked!");

                    }else{
                        System.out.println("Treated!");

                    }
                    break;
                case 2:
                    int applesAvailable = (int)(Math.random()*5)+1;
                    int score = bobbing(applesAvailable);
                    System.out.println("Your score is"+score);
                    break;
                case 3:
                    eyeballs();
                    break;
                default:
                    break;
            }
        }while (choice>=1 && choice<=3);
    }
    public static int getChoice(){
        Scanner input = new Scanner(System.in);
        int choice;
        choice = input.nextInt();
        return choice;
    }
    public static boolean trickOrTreat(){
        int tmp = (int)(Math.random()*50);
        int tmp2 = (int)(Math.random()*50)+50;
        System.out.println("Input a number between 1 and 100");
        Scanner input = new Scanner(System.in);
        int input1;
        input1 = input.nextInt();
        if (input1<=tmp2&&input1>=tmp){
            return false;
        }else{
            return true;
        }
    }
    public static int bobbing(int apple){
        int tmp;
        tmp = (int)(Math.random()*apple)+1;
        return tmp;
    }
    public static void eyeballs(){
        int eyeball = (int)(Math.random()*5)+1;
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number of eyeballs");
        int input1;
        input1 = input.nextInt();
        if(input1 == eyeball){
            System.out.println("You got it right!");

        }else{
            System.out.println("You failed");
        }
    }
}
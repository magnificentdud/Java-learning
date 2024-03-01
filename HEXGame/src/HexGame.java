// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class HexGame {
    static int NUM=0 ;
    static String Hexnum="0" ;

    public static void main(String[] args) {
        int Scorecnt;
        Scorecnt = 0;
        Scanner input = new Scanner(System.in);
        for (int i=0;i<20;i++){
            NumGen();
            Hex();
            System.out.println("Enter the hexadecimal number for "+NUM);
            String input1 = input.nextLine();
            if (input1.equals(Hexnum)){
                Scorecnt = Scorecnt + 1;
                System.out.print("Hooray! You got a point!");
            }else{
                System.out.println("You're wrong");
            }
        }
        System.out.println("Your score was "+Scorecnt);

    }
    public static void NumGen(){
        NUM = (int)(Math.random()*256);
    }
    public static void Hex(){
        Hexnum = Integer.toHexString(NUM);
    }

}
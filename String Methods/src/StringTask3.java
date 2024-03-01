import java.util.Scanner;

public class StringTask3 {
    public static void reverseLove(){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
//        System.out.println(word);
        if(word.indexOf("love") == 0){
            String newword;
            newword = word.substring(4);
            System.out.println("evol"+newword);

        }

    }
    public static void main(String[] args) {
        reverseLove();


    }
}
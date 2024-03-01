// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class burstfirst {

    public static void main(String[] args) {
        Scanner kbin = new Scanner(System.in);
        int[] stomachs;
        String prediction;
        boolean gameOver = false;

        String[] aliens = new String[4];

        aliens[0] = "Bob";
        aliens[1] = "Jess";
        aliens[2] = "Xin";
        aliens[3] = "Beau";
        do {

            stomachs = getStomachPercents();

            System.out.println("The aliens their current stomach percents are: ");
            for (int i = 0; i < 4; i++) {
                System.out.println(aliens[i] + " : " + stomachs[i]);
            }

            System.out.println("Who do you think will burst first?");
            prediction = getPrediction(aliens);

            while (stomachs[0] < 100 && stomachs[1] < 100 && stomachs[2] < 100 && stomachs[3] < 100) {
                for (int i = 0; i < 4; i++) {
                    stomachs[i] = stomachs[i] + feedAlien();
                }
            }

            int burstIndex = getBurstIndex(stomachs);
            if (aliens[burstIndex].equals(prediction)) {
                System.out.println("you win! play again!");

            } else {
                System.out.println("You lose! Game over");
                gameOver = true;
            }

        }while(gameOver==false);



    }
    public static int[] getStomachPercents(){
        int[] arr = new int[4];

        arr[0] = (int)(Math.random()*60)+1;
        arr[1] = (int)(Math.random()*60)+1;
        arr[2] = (int)(Math.random()*60)+1;
        arr[3] = (int)(Math.random()*60)+1;

        return arr;
    }
    public static int feedAlien(){
        int food;
        food = (int)(Math.random()+10)+1;
        return food;
    }
    public static String getPrediction(String[] aliens){
        Scanner kbin = new Scanner(System.in);
        String pre;
        pre = kbin.nextLine();
        while(!pre.equals(aliens[0])&&!pre.equals(aliens[1])&&!pre.equals(aliens[2])&&!pre.equals(aliens[3])){
            System.out.println("input a valid alien");
            pre = kbin.nextLine();
        }
        return pre;

    }
    public static int getBurstIndex(int[] stomachs){
        int tmp;
        tmp = 3;
        for(int i=0;i<4;i++){
            if (stomachs[i]>100){
                tmp = i;

            }
        }
        return tmp;
    }

}
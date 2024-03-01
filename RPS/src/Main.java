// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int player1;
        int player2;
        int count = 0;

        while (count<3){
            player1 = (int)(Math.random()*3);
            player2 = (int)(Math.random()*3);
//            player1 = 2;
//            player2 = 2;

            determineWinner(player1, player2);
            count = count+1;
        }
        endofgame();
    }
    public static void determineWinner(int p1, int p2){
        String win;
        win = "draw";
        if (p1-p2 == -1 || p1-p2 == 2){
            win = "p1";
        }else if (p1-p2 == -2 || p1-p2 == 1){
            win = "p2";
        }else if (p1==p2){
            win = "draw";
        }
        displayWinner(win);
    }
    public static void displayWinner(String winner){
        if (winner == "p1"){
            System.out.println("Player 1 is the winner");
        }else if (winner == "p2"){
            System.out.println("Player 2 is the winner");
        }else{
            System.out.println("It's a draw!");
        }
    }
    public static void endofgame(){
        for (int i=0;i<5;i++){
            System.out.println("thanks for playing");
        }
    }
}
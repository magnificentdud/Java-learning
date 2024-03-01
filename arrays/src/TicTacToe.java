import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class TicTacToe {
    static Scanner kbin;

    public static String[] board = {"-", "-", "-",
            "-", "-", "-",
            "-", "-", "-"};

    public static boolean game_still_going = true;

    public static String winner = null;

    public static String current_player = "X";

    public static void main(String[] args) {

        play_game();
    }

    public static void play_game() {
        display_board();

        while (game_still_going) {
            handle_turn(current_player);
            check_if_game_over();
            flip_player();
        }

        if (winner == "X"){
            System.out.println("User won.");
            writeToFile("X");
        } else if (winner != "X" && winner!= null){
            System.out.println("User Lost");
        } else if (winner == null) {
            System.out.println("Tie.");
        }
    }

    public static void display_board() {
        System.out.println("\n");
        System.out.println(board[0] + " | " + board[1] + " | " + board[2] + "     1 | 2 | 3");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5] + "     4 | 5 | 6");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8] + "     7 | 8 | 9");
        System.out.println("\n");
    }

    public static void handle_turn(String player) {
        if (player.equals("X")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(player + "'s turn.");
            System.out.print("Choose a position from 1-9: ");
            int position = scanner.nextInt();

            boolean valid = false;
            while (!valid) {
                while (position < 1 || position > 9) {
                    System.out.print("Choose a position from 1-9: ");
                    position = scanner.nextInt();
                }

                position = position - 1;

                if (board[position].equals("-")) {
                    valid = true;
                } else {
                    System.out.println("You can't go there. Go again.");
                }
            }

            board[position] = player;
        } else {
            System.out.println("Computer's turn.");
            int position;
            do {
                position =(int)(Math.random()*8)+1;
            } while (!board[position].equals("-"));

            board[position] = player;
        }

        display_board();
    }

    public static void check_if_game_over() {
        check_for_winner();
        check_for_tie();
    }

    public static void check_for_winner() {
        String row_winner = check_rows();
        String column_winner = check_columns();
        String diagonal_winner = check_diagonals();

        if (row_winner != null) {
            winner = row_winner;
        } else if (column_winner != null) {
            winner = column_winner;
        } else if (diagonal_winner != null) {
            winner = diagonal_winner;
        } else {
            winner = null;
        }
    }

    public static String check_rows() {
        //boolean game_still_going = true;

        boolean row_1 = board[0].equals(board[1]) && board[1].equals(board[2]) && !board[0].equals("-");
        boolean row_2 = board[3].equals(board[4]) && board[4].equals(board[5]) && !board[3].equals("-");
        boolean row_3 = board[6].equals(board[7]) && board[7].equals(board[8]) && !board[6].equals("-");

        if (row_1 || row_2 || row_3) {
            game_still_going = false;
        }

        if (row_1) {
            return board[0];
        } else if (row_2) {
            return board[3];
        } else if (row_3) {
            return board[6];
        } else {
            return null;
        }
    }

    public static String check_columns() {
      //  boolean game_still_going = true;

        boolean column_1 = board[0].equals(board[3]) && board[3].equals(board[6]) && !board[0].equals("-");
        boolean column_2 = board[1].equals(board[4]) && board[4].equals(board[7]) && !board[1].equals("-");
        boolean column_3 = board[2].equals(board[5]) && board[5].equals(board[8]) && !board[2].equals("-");

        if (column_1 || column_2 || column_3) {
            game_still_going = false;
        }

        if (column_1) {
            return board[0];
        } else if (column_2) {
            return board[1];
        } else if (column_3) {
            return board[2];
        } else {
            return null;
        }
    }

    public static String check_diagonals() {
      //  boolean game_still_going = true;

        boolean diagonal_1 = board[0].equals(board[4]) && board[4].equals(board[8]) && !board[0].equals("-");
        boolean diagonal_2 = board[2].equals(board[4]) && board[4].equals(board[6]) && !board[2].equals("-");

        if (diagonal_1 || diagonal_2) {
            game_still_going = false;
        }

        if (diagonal_1) {
            return board[0];
        } else if (diagonal_2) {
            return board[2];
        } else {
            return null;
        }
    }

    public static void check_for_tie() {
        boolean game_still_going = true;

        for (int i = 0; i < board.length; i++) {
            if (board[i].equals("-")) {
                game_still_going = false;
                break;
            }
        }

        if (game_still_going) {
            TicTacToe.game_still_going = false;
        }
    }

    public static void flip_player() {
        if (current_player.equals("X")) {
            current_player = "O";
        } else if (current_player.equals("O")) {
            current_player = "X";
        }
    }
    public static String getName(){
        System.out.println("what is your name? ");
        kbin = new Scanner(System.in);
        String name;
        name = kbin.nextLine();
        return name;
    }
    public static String getDate(){
        System.out.println("What is the date today?");
        kbin = new Scanner(System.in);
        String date;
        date = kbin.nextLine();
        return date;
    }
    public static void writeToFile(String winner){
        kbin = new Scanner(System.in);
        try {
            File myObj = new File("TicTacToeWinner.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("TicTacToewinner.txt");
            myWriter.write("You won the game!");
            myWriter.write("User name: "+getName()+"The date is: "+getDate());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

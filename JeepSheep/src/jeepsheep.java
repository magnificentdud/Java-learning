import java.util.Scanner;
import java.util.Random;

public class jeepsheep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int total_money = 1000;
        String[] racers = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter the name of the racer " + (i + 1) + ":");
            racers[i] = scanner.nextLine();
        }
        int[][] distances = new int[3][1]; // 2D array for distances
        int total_gone = 0;

        while (total_money > 0) {
            int turn = 0;
            System.out.print("Who do you think will win, " + racers[0] + ", " + racers[1] + ", or " + racers[2] + ":");
            String prediction = scanner.nextLine();
            while (!prediction.equals(racers[0]) && !prediction.equals(racers[1]) && !prediction.equals(racers[2])) {
                System.out.print("Invalid! Racer not available. Please enter only " + racers[0] + ", " + racers[1] + ", " + racers[2] + ":");
                prediction = scanner.nextLine();
            }

            // Initialize distances for the current race
            for (int i = 0; i < 3; i++) {
                distances[i][0] = 0;
            }

            while (distances[0][0] < 1000 && distances[1][0] < 1000 && distances[2][0] < 1000) {
                for (int i = 0; i < 3; i++) {
                    int distanceIncrement = random.nextInt(100) + 1;
                    distances[i][0] += distanceIncrement;
                }

                int k = random.nextInt(3) + 1;
                int i = random.nextInt(3);
                int j = random.nextInt(3);

                while (i == j) {
                    i = random.nextInt(3);
                    j = random.nextInt(3);
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (k == 1) {
                    System.out.println(racers[i] + " bumped into " + racers[j] + "!");
                } else if (k == 2) {
                    System.out.println(racers[i] + " got a speed boost!");
                } else {
                    System.out.println(racers[j] + " went out of track!");
                }

                System.out.println("score for turn " + turn + ":");
                for (int p = 0; p < 3; p++) {
                    System.out.println(racers[p] + " : " + distances[p][0] + "m");
                }
                System.out.println(" ");
                turn += 1;
            }

            int maxDistance = Math.max(distances[0][0], Math.max(distances[1][0], distances[2][0]));
            int winnerIndex = -1;

            for (int p = 0; p < 3; p++) {
                if (maxDistance == distances[p][0]) {
                    winnerIndex = p;
                    break;
                }
            }

            System.out.println("The winner is " + racers[winnerIndex]);
            total_gone += 1;

            if (racers[winnerIndex].equals(prediction)) {
                total_money += 400;
            } else {
                total_money -= 500;
            }

            System.out.println("You have " + total_money + " dollars");
        }

        if (total_money <= 0) {
            System.out.println();
            System.out.println();
            System.out.println("you lost all your money gambling");
        }
    }
}

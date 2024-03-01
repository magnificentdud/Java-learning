import java.util.Scanner;

public class Main {

    // global variables
    static Scanner kbin;

    public static void main(String[] args) {

        // initialize kbin
        kbin = new Scanner(System.in);

        // declare local variables
        String choice, tool;
        boolean available;

        // 2D array representing the tool shelf
        String[][] toolShelf = {
                {"wrench", "spanner", "screwdriver", "paintbrush"},
                {"drill", "chainsaw", "fork", "spade"}
        };

        do {
            displayTools();

            tool = requestTool();

            available = findTool(toolShelf, tool);

            if (available) {
                takeTool(toolShelf, tool);
            } else {
                unavailable(tool);
            }

            System.out.println("Do you want to continue y/n: ");

            choice = kbin.nextLine();

        } while (choice.equalsIgnoreCase("y"));
    }

    public static void displayTools() {

        // current tool set
        String[] toolSet = {"wrench", "spanner", "screwdriver", "paintbrush", "drill", "chainsaw", "fork", "spade"};

        System.out.println("Full Tool Set");
        // loop through toolSet and display all tools
        for (int i = 0; i < toolSet.length; i++) {
            System.out.println("\t" + toolSet[i]);
        }
    }

    public static String requestTool() {

        String myTool;
        boolean validTool;

        do {
            System.out.println("Which tool do you want to borrow: ");
            myTool = kbin.nextLine();
            validTool = isValidTool(myTool);

            if (!validTool) {
                System.out.println("Wrong input. Please enter a valid tool.");
            }

        } while (!validTool);

        return myTool;
    }

    public static boolean isValidTool(String tool) {
        // Check if the entered tool is in the tool shelf
        return tool.equals("wrench") || tool.equals("spanner") || tool.equals("screwdriver") || tool.equals("paintbrush") ||
                tool.equals("drill") || tool.equals("chainsaw") || tool.equals("fork") || tool.equals("spade");
    }

    public static boolean findTool(String[][] shelf, String t) {
        int cnt = 0;
        for(int i=0;i<shelf.length;i++){
            if(shelf[0][i].equals(t)){
                cnt += 1;
            }

        }
        if (cnt == 1){
            return true;
        }else{
            return false;
        }

    }

    public static void takeTool(String[][] shelf, String toolToTake) {
        //search the shelf for toolToTake and replace element with null
        for(int i = 0; i<shelf.length; i++) {
            for(int j = 0; j<shelf[i].length; j++) {
                if(shelf[i][j].equals(toolToTake)) {
                    shelf = null;
                    return;
                }
            }
        }
    }

    public static void unavailable(String tool) {

        System.out.println(tool + " is currently unavailable!");
    }
}

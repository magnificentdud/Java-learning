import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class BMICalc {

    static Scanner kbin;

    public static void main(String[] args) {
//
//        kbin = new Scanner(System.in);
//        String choice;
//
//        do{
//            BMICalculator();
//
//            System.out.println("Enter y to continue or any other key to quit: ");
//            choice = kbin.next();
//        }while(choice.equalsIgnoreCase("y"));
        double h;
        h = getHeight();
        int w;
        w = getWeight();
        writeToFile(h,w,calculate(h,w));

    }

    public static void BMICalculator() {

        welcome();

        displayResult(calculate(getHeight(),getWeight()));

    }

    /*
     * This function displays a message.
     */
    public static void welcome() {
        System.out.println("Welcome to the BMI Caclulator!");
    }

    /*
     * This function asks a user for a height in meters between 1.0 and 2.25 and returns the result
     */
    public static double getHeight() {


        double h;
        kbin = new Scanner(System.in);
        System.out.println("Enter a height in meters: ");
        h = kbin.nextDouble();

        return h;


    }

    /*
     * this function asks a user for a weight value as a whole number between 25 and 85 and returns the result
     */
    public static int getWeight() {
        int w;
        kbin = new Scanner(System.in);
        System.out.println("Enter a weight value as a whole number: ");
        w = kbin.nextInt();

        return w;
    }

    /*this function takes a double and an integer as parameters, calculates BMI and returns a double value
     *
     */
    public static double calculate(double heightValue, int weightValue) {
        kbin = new Scanner(System.in);
        double bmi = weightValue/Math.pow(heightValue, 2);

        return bmi;
    }

    /*
     * This function takes a double as a parameter and displays the value in a meaningful sentence
     */
    public static void displayResult(double displayValue) {
        kbin = new Scanner(System.in);
        System.out.println("The BMI is calculated to be "+displayValue);
    }
    public static void writeToFile(double Height, int Weight, double BMI){
        kbin = new Scanner(System.in);
        try {
            File myObj = new File("BMI_DATA.txt");
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
            FileWriter myWriter = new FileWriter("BMI_DATA.txt");
            myWriter.write("Height: "+Height + "; Weight: "+Weight+"; BMI: " + BMI);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}

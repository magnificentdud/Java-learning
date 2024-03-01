import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for the taxable income in integer.
 * 2. Read input as "int".
 * 3. Compute the tax payable using nested-if in "double".
 * 4. Print the values rounded to 2 decimal places.
 */
public class Main {
    public static void taxCalculator() {
        // Declare constants first (variables may use these constants)
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;

        // Declare variables
        int taxableIncome;
        double taxPayable;

        // Prompt and read inputs as "int"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the taxable income: $");
        taxableIncome = in.nextInt();

        // Compute tax payable in "double" using a nested-if to handle 4 cases
        if (taxableIncome <= 20000) {         // [0, 20000]
            taxPayable = 0;
        } else if (taxableIncome <= 40000) {  // [20001, 40000]
            taxPayable = (taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
        } else if (taxableIncome <= 60000) {  // [40001, 60000]
            taxPayable = 20000 * TAX_RATE_ABOVE_20K
                    + (taxableIncome - 40000) * TAX_RATE_ABOVE_40K;
        } else {                              // >=60001
            taxPayable = 20000 * TAX_RATE_ABOVE_20K
                    + 20000 * TAX_RATE_ABOVE_40K
                    + (taxableIncome - 60000) * TAX_RATE_ABOVE_60K;
        }

        // Alternatively, you could use the following nested-if conditions
        // but the above follows the table data
        //if (taxableIncome > 60000) {          // [60001, ]
        //   ......
        //} else if (taxableIncome > 40000) {   // [40001, 60000]
        //   ......
        //} else if (taxableIncome > 20000) {   // [20001, 40000]
        //   ......
        //} else {                              // [0, 20000]
        //   ......
        //}

        // Print result rounded to 2 decimal places
        System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
    }
    public static void main(String[] args) {

        taxCalculator();
//        taxCalculator();
//        taxCalculator();
//        taxCalculator();
//        taxCalculator();
//        taxCalculator();
//        taxCalculator();

    }
}
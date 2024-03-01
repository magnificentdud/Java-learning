public class TheScientist {
    public static void main(String[] args) {
        double[] values = new double[100000];

        for (int i = 0; i < values.length; i++) {
            values[i] = Math.random() * 16 + 5;
        }

        double maxVal = getMax(values);
        double minVal = getMin(values);
        double averageVal = getAverage(values);

        int count = getCount(values, 14.4);

        System.out.println("Max: " + maxVal + "\n Min: " + minVal + "\n Average: " + averageVal + "\n Count: " + count);
    }

    public static double getMax(double[] values) {
        double maximum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > maximum) {
                maximum = values[i];

            }
        }
        return maximum;
    }

    public static double getMin(double[] values) {
        double minimum = 21;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < minimum) {
                minimum = values[i];
            }
        }
        return minimum;
    }

    public static double getAverage(double[] values) {
        double total = 0;
        for (int i = 0; i < values.length; i++) {
            total = total + values[i];

        }
        double average = total / (values.length);
        return average;


    }

    public static int getCount(double[] values, double num) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > num) {
                count = count + 1;
            }
        }
        return count;


    }

}

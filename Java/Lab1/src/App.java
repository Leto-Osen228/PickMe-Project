import java.util.Random;
import java.lang.Math;

public class App {

    private static double calculate(int s, float x){
        if (s == 5){
            return 3.0 / 4.0 * Math.log(Math.pow(Math.abs(x),2));
        } else if (s == 3 || s == 4 || s == 7 || s == 8 || s == 11 || s == 13 || s == 17){
            return Math.log(Math.acos((x - 3.5) / 17.0));
        } else {
            double a = 1.0/2.0 / Math.cos(Math.log(Math.abs(x)));
            double b = Math.asin((x - 3.5) / 17.0);
            return Math.cbrt(Math.pow(a, b));
        }
    }

    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double w : row) {
                System.out.printf("%6.2f", w);
            }
            System.out.println();
        }   
    }

    public static void main(String[] args) throws Exception {
        int s[] = new int[15];
        for (int number = 17, index = 0; number >= 3; number--, index++)
            s[index] = number;

        float x[] = new float[15];
        Random random = new Random();
        for (int i = 0; i < x.length; i++)
            x[i] = random.nextFloat(12 + 5) - 12;

        double w[][] = new double[15][15];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                w[i][j] = App.calculate(s[i], x[j]);
            }
        }

        App.printMatrix(w);
    }
}

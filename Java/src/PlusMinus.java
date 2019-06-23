//Given an array of integers, calculate the fractions of its elements that
//        are positive, negative, and are zeros. Print the decimal value of
//        each fraction on a new line.
import java.util.*;

public class PlusMinus {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the plusMinus function below.

    //Method for formatting Double into String with precision
    static void parseDouble(double input) {
        input = Double.parseDouble(String.format("%.6f"));
    }

    static void plusMinus(int[] arr) {
        double positive = 0;
        double negative = 0;
        double zero = 0;
        int length = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            }
            if (arr[i] < 0) {
                negative++;
            }
            if (arr[i] == 0) {
                zero++;
            }
        }
        System.out.printf("%.6f %n", positive/length);
        System.out.printf("%.6f %n", negative/length);
        System.out.printf("%.6f %n", zero/length);
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        plusMinus(arr);
        scanner.close();
    }
}

import java.io.IOException;
import java.util.Scanner;

public class CalculateMaxNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int max = ar[0];
    //define max value in array
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        //calculate count of max values
        int count = 0;
        for (int i = 0; i < ar.length; i++) {

            if (ar[i] == max) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);
        int[] arr = new int[]{3, 2, 1, 3};
        System.out.println(result);
        scanner.close();
    }
}

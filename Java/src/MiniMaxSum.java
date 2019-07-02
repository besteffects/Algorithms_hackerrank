/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the
five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 */

import java.util.Scanner;

public class MiniMaxSum {

    private static final Scanner scanner = new Scanner(System.in);

    static void miniMaxSum(long[] arr) {
        long min = arr[0];
        long max = arr[0];
        long sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        sum = sum + arr[0];
        long sumMin = sum - min;
        long sumMax = sum - max;
        System.out.println(sumMax + " " + sumMin);
    }

    // Complete the miniMaxSum function below.
    static void miniMaxSum1(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        System.out.println();
        int min = arr[0];
        int max = arr[arr.length - 1];
        int sumMin = 0;
        int sumMax = 0;
        for (int i = 1; i < arr.length; i++) {
            sumMax += arr[i];

        }
        for (int i = 0; i < arr.length - 1; i++) {
            sumMin += arr[i];

        }
        System.out.print(sumMin + " " + sumMax);
    }

    public static void main(String[] args) {
        long[] arr = new long[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

//        miniMaxSum1(arr);
        miniMaxSum(arr);

        scanner.close();
    }
}

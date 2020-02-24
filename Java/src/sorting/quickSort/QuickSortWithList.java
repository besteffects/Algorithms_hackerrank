package sorting.quickSort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSortWithList {

    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> equal = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        int pivot = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < pivot) {
                left.add(arr[i]);
            } else if (arr[i] == pivot) {
                equal.add(arr[i]);
            } else if (arr[i] > pivot) {
                right.add(arr[i]);
            }
        }
        List<Integer> newList = new ArrayList<Integer>();
        newList.addAll(left);
        newList.addAll(equal);
        newList.addAll(right);
        int[] array = new int[newList.size()];
        for (int i = 0; i < newList.size(); i++) {
            array[i] = newList.get(i);
        }
        return array;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        int[] result = quickSort(arr);
        scanner.close();
    }
}

package sorting.quickSort;
/*
The previous challenges covered Insertion Sort, which is a simple and intuitive sorting algorithm with a running time of O(N2).
 In these next few challenges, we're covering a divide-and-conquer algorithm called Quicksort (also known as Partition Sort).
 This challenge is a modified version of the algorithm that only addresses partitioning. It is implemented as follows:

Step 1: Divide
Choose some pivot element,p , and partition your unsorted array, arr, into three smaller arrays: left, right, and equal,
where each element in left<p, each element in right>p, and each element in equal=p.

For example: Assume arr=[5,7,4,3,8]
The pivot is at arr[0]=5
arr is divided into left={4,3}, equal={5}, and right={7,8}.
Putting them all together, you get {4,3,5,7,8}. Another valid solution is {3,4,5,8,7}.

Given arr and p=arr[0], partition arr into left, right, and equal using the Divide instructions above. Then print each element
in left followed by each element in equal, followed by each element in right on a single line. Your output should be space-separated
 and does not have to maintain ordering of the elements within the three categories.

Function Description

Complete the quickSort function in the editor below. It should return an array of integers as described above.
quickSort has the following parameter(s):
- arr: an array of integers where arr[0] is the pivot element

Input Format
The first line contains n, the size of the array arr.
The second line contains n space-separated integers describing arr (the unsorted array). The first integer (corresponding to arr[0])
 is your pivot element, p.

Constraints
- 1<=n<=1000
- -1000<=arr[i]<=1000 where 0<=i<n
- All elements will be unique.

Output Format
On a single line, print the partitioned numbers (i.e.: the elements in left, then the elements in equal, and then the elements in right).
Each integer should be separated by a single space.

Sample Input

5
4 5 3 7 2

Sample Output
3 2 4 5 7
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {
        int[] finalArray = new int[arr.length];
        int pivot=arr[0];
        int j=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] < pivot) {
                finalArray[j++] = arr[i];
            }
        }
            for (int i=0;i<arr.length;i++) {
                if (arr[i] == pivot) {
                    finalArray[j++] = arr[i];
                }
            }
            for (int i=0;i<arr.length;i++) {
                if (arr[i] > pivot) {
                    finalArray[j++] = arr[i];
                }
            }
        System.out.println(Arrays.toString(finalArray));   //prints the resultant array

        return finalArray;
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

        for (int i = 0; i < result.length; i++) {
           // bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
           //     bufferedWriter.write(" ");
            }
        }

      //  bufferedWriter.newLine();

      //  bufferedWriter.close();

        scanner.close();
    }
}


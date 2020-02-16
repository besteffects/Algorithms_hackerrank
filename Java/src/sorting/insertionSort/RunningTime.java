package sorting.insertionSort;
/*
Can you modify your previous Insertion Sort implementation to keep track of the number of shifts it makes while sorting?
The only thing you should print is the number of shifts made by the algorithm to completely sort the array.
 A shift occurs when an element's position changes in the array. Do not shift an element if it is not necessary.

Function Description
Complete the runningTime function in the editor below. It should return an integer representing the number of shifts it
 will take to sort the given array.

runningTime has the following parameter(s):
arr: an array of integers

Input Format
The first line contains the integer n, the number of elements to be sorted.
The next line contains n integers of arr[arr[0]...arr[n-1]].

Constraints
1<=n<=1001

Output Format
Output the number of shifts it takes to sort the array.

Sample Input
5
2 1 3 1 2

Sample Output
4

Explanation
Iteration   Array      Shifts
0           2 1 3 1 2
1           1 2 3 1 2     1
2           1 2 3 1 2     0
3           1 1 2 3 2     2
4           1 1 2 2 3     1

Total                     4
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RunningTime {

    // Complete the runningTime function below.
    static int runningTime(int[] arr) {
return 1;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = runningTime(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


package sorting.insertionSort;
/*
Loop Invariant
In computer science, you could prove it formally with a loop invariant, where you state that a desired property is maintained in your loop. Such a proof is broken down into the following parts:

- Initialization: It is true (in a limited sense) before the loop runs.
- Maintenance: If it's true before an iteration of a loop, it remains true before the next iteration.
- Termination: It will terminate in a useful way once it is finished
Say, you have some InsertionSort code, where the outer loop goes through the whole array :

for(int i = 1; i < A.length; i++){
//insertion sort code
You could then state the following loop invariant:
At the start of every iteration of the outer loop (indexed with i), the subarray until ar[i] consists of the original
elements that were there, but in sorted order.

To prove Insertion Sort is correct, you will then demonstrate it for the three stages:
- Initialization - The subarray starts with the first element of the array, and it is (obviously) sorted to begin with.
- Maintenance - Each iteration of the loop expands the subarray, but keeps the sorted property. An element V gets inserted
 into the array only when it is greater than the element to its left. Since the elements to its left have already been sorted,
 it means V is greater than all the elements to its left, so the array remains sorted. (In Insertion Sort 2 we saw this by
 printing the array each time an element was properly inserted.)
- Termination - The code will terminate after i has reached the last element in the array, which means the sorted subarray
 has expanded to encompass the entire array. The array is now fully sorted.

 Challenge
In the InsertionSort code below, there is an error. Can you fix it? Print the array only once, when it is fully sorted.

Input Format
There will be two lines of input:
 -s the size of the array
 -arr the list of numbers that makes up the array

Output Format

Output the numbers in order, space-separated on one line.

Sample Input
6
7 4 3 5 6 2

Sample Output
2 3 4 5 6 7
Explanation
The corrected code returns the sorted array.
 */

import java.util.Scanner;

public class LoopInvariant {
    static void insertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int value = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > value) { // here was the error
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }

        printArray(A);
    }


    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        insertionSort(ar);
    }
}


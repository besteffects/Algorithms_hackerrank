package sorting;

import java.util.Arrays;

public class GeneralSortingTasks {
    /*
   Sorting is useful as the first step in many different tasks. The most common task is to make finding things easier,
   but there are other uses as well. In this case, it will make it easier to determine which pair or pairs of elements
   have the smallest absolute difference between them.

For example, if you've got the list [5,2,3,4,1], sort it as [1,2,3,4,5] to see that several pairs have the minimum
difference of 1: (1,2),(2,3), (3,4), (4,5). The return array would be [1,2,2,3,3,4,4,5].

Given a list of unsorted integers, arr, find the pair of elements that have the smallest absolute difference between them.
 If there are multiple pairs, find them all.

Function Description
Complete the closestNumbers function in the editor below. It must return an array of integers as described.
closestNumbers has the following parameter(s):
arr: an array of integers

Input Format

The first line contains a single integer n, the length of arr.
The second line contains n space-separated integers, arr[i].

Constraints
All a[i] are unique in arr.
Output Format

Output the pairs of elements with the smallest difference. If there are multiple pairs, output all of them in ascending
order, all on the same line with just a single space between each pair of numbers. A number may be part of two pairs
when paired with its predecessor and its successor.

Sample Input 1
12
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470
Sample Output 1
-520 -470 -20 30
Explanation 1
(-470) - (-520) = 30 - (-20) = 50, which is the smallest difference.

Sample Input 2
4
5 4 3 2
Sample Output 2
2 3 3 4 4 5
     */
    public static void main(String[] args) {
        closestNumbers(new int[]{-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470});
    }

    static int[] closestNumbers(int[] arr) {
        int closestDifference = Integer.MAX_VALUE; // Initialize difference as infinite
        int count = 0;
//1 sort the array (insertion sort) or use Arrays.sort(arr) for sorting
        for (int i = 1; i < arr.length; i++) { //first element 0 is already sorted, we start from 1
            int key = arr[i]; //an item from 1 to the list.length
            int j = i - 1; //inner loop for i-1 to 0 (elements to the left). For example, when i=1 we compare with element with index 0
            while (j >= 0 && key < arr[j]) { //key reaches value that it is not longer smaller than
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                //swap
                j--;
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
//2 Find the smallest difference of array elements
        for (int k = 0; k < arr.length - 1; k++) {
            if (Math.abs(arr[k + 1] - arr[k]) < closestDifference) {
                closestDifference = Math.abs(arr[k + 1] - arr[k]);
                count = 1; // calculating the number of int in a new array
            } else if ((Math.abs(arr[k + 1] - arr[k])) == closestDifference) {
                ++count;
            }
        }
        System.out.println("Closest difference: " + closestDifference + "count: " + count);
        //3 fill array with index1, index2
        int[] finalArray = new int[count * 2];
        int l = 0;
        for (int k = 0; k < arr.length-1; k++) {
            if (Math.abs(arr[k + 1] - arr[k]) == closestDifference) {
                finalArray[l++] = arr[k];
                finalArray[l++] = arr[k + 1];
            }
        }

        System.out.println("Sorted array:  " + Arrays.toString(arr));
        System.out.println("Final array with closest numbers: " + Arrays.toString(finalArray));
        return finalArray;
    }
}

package sorting;

import java.util.Arrays;

/*
The median of a list of numbers is essentially it's middle element after sorting. The same number of elements occur
after it as before. Given a list of numbers with an odd number of elements, can you find the median?
For example, the median of arr=[1,2,3,4,5] is 3, the middle element in the sorted array.

Function Description
Complete the findMedian function in the editor below. It must return an integer that represents the median of the array.
findMedian has the following parameter(s):
arr: an unsorted array of integers

Input Format
The first line contains the integer n, the size of arr.
The second line contains n space-separated integers arr[i]

Constraints

n is odd
Output Format
Output one integer, the median.

Sample Input 0
7
0 1 2 4 6 5 3

Sample Output 0
3
Explanation 0

The sorted arr=[0,1,2,3,4,5]. It's middle element is at arr[3]=3.
 */
public class FindMedian_quickSelect {
    public static void main(String[] args) {
        findMedian(new int[]{0, 1, 2, 4, 6, 5, 3});
    }

    static int findMedian(int[] arr) {
        int middle = 0;
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        middle = arr[(arr.length / 2)];
        System.out.println("Middle: " + middle);
        return middle;
    }

    //2 Sorting with quick select
    // quickSelect function similar to quick sort
    // Considers last element as pivot and adds
    // elements with less value to the left and
    // high value to the right and also changes
    // the pivot position to its respective position
    // in the final array.
    public static int quickSelect(int[] arr,
                                  int low, int high)
    {
        int pivot = arr[high], pivotIndex = low;
        for (int i = low; i <= high; i++)
        {
            // inserting elements of less value
            // to the left of the pivot location
            if(arr[i] < pivot)
            {
                //swap
                int temp = arr[i];
                arr[i] = arr[pivotIndex];
                arr[pivotIndex] = temp;
                pivotIndex++;
            }
        }

        // swapping pivot to the final pivot location
        int temp = arr[high];
        arr[high] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        return pivotIndex;
    }

    // finds the kth position (of the sorted array)
    // in a given unsorted array i.e this function
    // can be used to find both kth largest and
    // kth smallest element in the array.
    // ASSUMPTION: all elements in arr[] are distinct
    public static int kthSmallest(int[] arr, int low,
                                  int high, int k)
    {
        // find the quickSelect
        int partition = quickSelect(arr,low,high);

        // if quickSelect value is equal to the kth position,
        // return value at k.
        if(partition == k)
            return arr[partition];

            // if quickSelect value is less than kth position,
            // search right side of the array.
        else if(partition < k )
            return kthSmallest(arr, partition + 1, high, k );

            // if quickSelect value is more than kth position,
            // search left side of the array.
        else
            return kthSmallest(arr, low, partition-1, k );
    }
}


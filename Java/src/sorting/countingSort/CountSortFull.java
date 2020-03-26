package sorting.countingSort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
/*
In this challenge you need to print the string that accompanies each integer in a list sorted by the integers.
If two strings are associated with the same integer, they must be printed in their original order so your sorting algorithm should be stable.
There is one other twist. The first half of the strings encountered in the inputs are to be replaced with the character "-" (dash).
Insertion Sort and the simple version of Quicksort are stable, but the faster in-place version of Quicksort is not since it scrambles around elements while sorting.
In this challenge, you will use counting sort to sort a list while keeping the order of the strings preserved.
For example, if your inputs are [[0,a], [1,b], [0,c], [1,d] you could set up a helper array with three empty arrays as elements.
The following shows the insertions:
i	string	converted	list
0				    [[],[],[]]
1 	a 	    -		[[-],[],[]]
2	b	    -		[[-],[-],[]]
3	c			    [[-,c],[-],[]]
4	d			    [[-,c],[-,d],[]]
The result is then printed: -c -d.

Function Description
Complete the countSort function in the editor below. It should construct and print out the sorted strings.
countSort has the following parameter(s):
- arr: a 2D array where each arr[i] is comprised of two strings: x and s.
Note: The first element of each arr[i],x , must be cast as an integer to perform the sort.

Input Format

The first line contains n, the number of integer/string pairs in the array arr.
Each of the next n contains x[i] and s[i], the integers (as strings) with their associated strings.

Output Format
Print the strings in their correct order, space-separated on one line.

Sample Input
20
0 ab
6 cd
0 ef
6 gh
4 ij
0 ab
6 cd
0 ef
6 gh
0 ij
4 that
3 be
0 to
1 be
5 question
1 or
2 not
4 is
2 to
4 the
Sample Output
- - - - - to be or not to be - that is the question - - - -

Explanation
Below is the list in the correct order. In the array at the bottom, strings from the first half of the original array were replaced with dashes.

0 ab
0 ef
0 ab
0 ef
0 ij
0 to
1 be
1 or
2 not
2 to
3 be
4 ij
4 that
4 is
4 the
5 question
6 cd
6 gh
6 cd
6 gh

sorted = [['-', '-', '-', '-', '-', 'to'], ['be', 'or'], ['not', 'to'], ['be'], ['-', 'that', 'is', 'the'], ['question'], ['-', '-', '-', '-'], [], [], [], []]
 */
public class CountSortFull {
    public static void main(String [] args) throws IOException {
        final int maxValue = 100;

        /* Create HashMap with empty "buckets" to put Strings into */
        HashMap<Integer, ArrayList<String>> map = new HashMap<>(maxValue);
        for (int i = 0; i < maxValue; i++) {
            map.put(i, new ArrayList<String>());
        }

        /* Save input */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String [] pair = br.readLine().split(" ");
            int key        = Integer.parseInt(pair[0]);
            String value   = (i < n/2) ? "-" : pair[1];

            ArrayList<String> list = map.get(key);
            list.add(value);
        }
        br.close();

        /* Print output */
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < maxValue; i++) {
            ArrayList<String> values = map.get(i);
            for (String str : values) {
                sb.append(str + " ");
            }
        }
        System.out.println(sb);
    }
}
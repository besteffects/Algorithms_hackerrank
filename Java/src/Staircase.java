/*
Consider a staircase of size n=4:
   #
  ##
 ###
####
Observe that its base and height are both equal to n, and the image is drawn using # symbols and spaces.
The last line is not preceded by any spaces.

Write a program that prints a staircase of size n.

Function Description
Complete the staircase function in the editor below. It should print a staircase as described above.
Staircase has the following parameter(s):
n: an integer

Input Format
A single integer, n, denoting the size of the staircase.

Constraints

0<n<=100.

Output Format

Print a staircase of size n using # symbols and spaces.

Note: The last line must have 0 spaces in it.

Sample Input
6

Sample Output
     #
    ##
   ###
  ####
 #####
######

Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=6.
 */

import java.util.Scanner;

public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {
        String str="#";
        for (int i = 0; i < n; i++) {
            System.out.printf("%"+n+"s%n",str);
            str=str+"#";
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
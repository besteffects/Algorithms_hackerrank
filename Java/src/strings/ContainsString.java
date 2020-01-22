package strings;

import java.io.IOException;
import java.util.Scanner;
/*
We say that a string contains the word hackerrank if a subsequence of its characters spell the word hackerrank.
For example, if string s=haacckkerrannkk it does contain hackerrank, but s=haacckkerannk does not. In the second case,
the second r is missing. If we reorder the first string as hccaakkerrannkk, it no longer contains the subsequence due to ordering.
More formally, let p[0],p[1],..p[9] be the respective indices of h, a, c, k, e, r, r, a, n, k in string . If p[0]<p[1]<
 p[2]< ... < p[9] is true, then s contains hackerrank.
For each query, print YES on a new line if the string contains hackerrank, otherwise, print NO.

Function Description
Complete the hackerrankInString function in the editor below. It must return YES or NO.
hackerrankInString has the following parameter(s):
s: a string

Input Format
The first line contains an integer , the number of queries.
Each of the next q lines contains a single query string s.

Output Format
For each query, print YES on a new line if s contains hackerrank, otherwise, print NO.

Sample Input 0

2
hereiamstackerrank
hackerworld

Sample Output 0
YES
NO */

public class ContainsString {

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {

        String str = "hackerrank";
        if (s.length() < str.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);
            System.out.println(result);
            //   bufferedWriter.write(result);
            //  bufferedWriter.newLine();
        }

        //  bufferedWriter.close();

        scanner.close();
    }
}

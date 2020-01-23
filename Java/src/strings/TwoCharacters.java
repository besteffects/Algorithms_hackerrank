package strings;
/*
In this challenge, you will be given a string. You must remove characters until the string is made up of any two alternating
characters. When you choose a character to remove, all instances of that character must be removed. Your goal is to create
the longest string possible that contains just two alternating letters.

As an example, consider the string abaacdabd. If you delete the character a, you will be left with the string bcdbd.
Now, removing the character c leaves you with a valid string bdbd having a length of 4. Removing either b or d at any point
would not result in a valid string.

Given a string s, convert it to the longest possible string t made up only of alternating characters. Print the length of
string  on a new line. If no string t can be formed, print 0 instead.

Function Description
Complete the alternate function in the editor below. It should return an integer that denotes the longest string that can
be formed, or 0 if it cannot be done.

alternate has the following parameter(s):
s: a string

Input Format
The first line contains a single integer denoting the length of s.
The second line contains string s.

Constraints
1<=|s|<=1000

Output Format
Print a single integer denoting the maximum length of t for the given s; if it is not possible to form string t, print 0 instead.

Sample Input
10
beabeefeab

Sample Output
5
Explanation

The characters present in s are a, b, e, and f. This means that t must consist of two of those characters and we must
delete two others. Our choices for characters to leave are [a,b], [a,e], [a, f], [b, e], [b, f] and [e, f].
If we delete e and f, the resulting string is babab. This is a valid t as there are only two distinct characters (a and b),
and they are alternating within the string.

If we delete a and f, the resulting string is bebeeeb. This is not a valid string t because there are consecutive e's present.
Removing them would leave consecutive b's, so this fails to produce a valid string t.

Other cases are solved similarly.
babab is the longest string we can create.

 */

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoCharacters {

    // Complete the alternate function below.
    static int alternate(String s) {
        Set<Character> char_set = new HashSet<Character>();

        for (int i = 0; i < s.length(); i++) {
            char_set.add(s.charAt(i));
        }

        Character[] char_arr = char_set.toArray(new Character[char_set.size()]);
        int max = 0;

        for (int j = 0; j < char_arr.length - 1; j++) {
            for (int k = j + 1; k < char_arr.length; k++) {
                String pattern = "([^" + char_arr[j] + char_arr[k] + "])";
                String trimmedStr = s.replaceAll(pattern, "");
                if (isTwoCharacter(trimmedStr) && trimmedStr.length() > max) {
                    max = trimmedStr.length();
                }
            }
        }
        return max;
    }

    static boolean isTwoCharacter(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner scanner = new Scanner(System.in);

        // int l = Integer.parseInt(bufferedReader.readLine().trim());

        // String s = bufferedReader.readLine();
        //int q = scanner.nextInt();
        String s = scanner.nextLine();
        int result = alternate(s);
        System.out.println(result);
        // bufferedWriter.write(String.valueOf(result));
        //  bufferedWriter.newLine();

        //  bufferedReader.close();
        //  bufferedWriter.close();
    }
}

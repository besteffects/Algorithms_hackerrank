/*
Alice wrote a sequence of words in CamelCase as a string of letters, s, having the following properties:

- It is a concatenation of one or more words consisting of English letters.
- All letters in the first word are lowercase.
- For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given s, print the number of words in s on a new line.

For example, s=oneTwoThree. There are 3 words in the string.

Function Description

Complete the camelcase function in the editor below. It must return the integer number of words in the input string.

camelcase has the following parameter(s):

s: the string to analyze

Input Format
A single line containing string .

Constraints
1<=|s|<=10.pow(5)
Output Format

Print the number of words in string .

Sample Input

saveChangesInTheEditor
Sample Output

5
Explanation

String  contains five words:

save
Changes
In
The
Editor
Thus, we print  on a new line.
 */
import java.io.IOException;
import java.util.Scanner;

public class CamelCase {

    // Complete the camelcase function below.
    static int camelcase(String s) {
        int words = 1;
        for (int i = 0; i < s.length(); i++) {
            String letter = Character.toString(s.charAt(i));
            if (letter == letter.toUpperCase()) {
                words++;
            }
        }
        return words;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        int result = camelcase(s);

        System.out.println(result);

        scanner.close();
    }
}

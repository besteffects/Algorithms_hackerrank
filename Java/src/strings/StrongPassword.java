package strings;

import java.io.IOException;
import java.util.Scanner;

/*
Louise joined a social networking site to stay in touch with her friends. The signup page required
her to input a name and a password. However, the password must be strong. The website considers a
password to be strong if it satisfies the following criteria:

Its length is at least 6.
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
She typed a random string of length n in the password field but wasn't sure if it was strong.
Given the string she typed, can you find the minimum number of characters she must add to make her
password strong?
Note: Here's the set of types of characters in a form you can paste in your solution:

numbers = "0123456789"
lower_case = "abcdefghijklmnopqrstuvwxyz"
upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
special_characters = "!@#$%^&*()-+"

Input Format
The first line contains an integer n denoting the length of the string.
The second line contains a string consisting of  characters, the password typed by Louise.
Each character is either a lowercase/uppercase English alphabet, a digit, or a special character.

Constraints
1<=n<=100

Output Format
Print a single line containing a single integer denoting the answer to the problem.

Sample Input 0
3
Ab1

Sample Output 0
3

Explanation 0
She can make the password strong by adding  characters, for example, $hk, turning the password
 into Ab1$hk which is strong.
2 characters aren't enough since the length must be at least .

Sample Input 1
11
#HackerRank
Sample Output 1

1
Explanation 1

The password isn't strong, but she can make it strong by adding a single digit.
 */
public class StrongPassword {

    // Complete the minimumNumber function below.
    static int minimumNumber(String password) { //will return int
        int numberOfCharsToInput = 0;
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] lower_case = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] upper_case = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] special_characters = {'!', '@', '#', '$', '%', '^', '&', '*', '(', '\'', ')', '-', '+'};
        int numbersCount = 0;
        int lower_caseCount = 0;
        int upper_caseCount = 0;
        int specialCount = 0;

        if (password.length() == 0) {
            numberOfCharsToInput = 6;
        }
        // Return the minimum number of characters to make the password strong
        char[] charPassword = password.toCharArray();
        for (int i = 0; i < charPassword.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == charPassword[i]) {
                    System.out.println("Number " + numbers[j] + " found in string " + password);
                    numbersCount++;
                }
            }
        }
        System.out.println("Numbers count: " + numbersCount);

        for (int i = 0; i < charPassword.length; i++) {
            for (int j = 0; j < lower_case.length; j++) {
                if (lower_case[j] == charPassword[i]) {
                    System.out.println("LowerCase count " + lower_case[j] + " found in string " + password);
                    lower_caseCount++;
                }
            }
        }
        System.out.println("LowerCase count: " + lower_caseCount);

        for (int i = 0; i < charPassword.length; i++) {
            for (int j = 0; j < upper_case.length; j++) {
                if (upper_case[j] == charPassword[i]) {
                    System.out.println("LowerCase count " + upper_case[j] + " found in string " + password);
                    upper_caseCount++;
                }
            }
        }
        System.out.println("LowerCase count: " + upper_caseCount);

        for (int i = 0; i < charPassword.length; i++) {
            for (int j = 0; j < special_characters.length; j++) {
                if (special_characters[j] == charPassword[i]) {
                    System.out.println("LowerCase count " + special_characters[j] + " found in string " + password);
                    specialCount++;
                }
            }
        }
        System.out.println("Special chars count: " + specialCount);

        return numberOfCharsToInput;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        minimumNumber("Ab1");
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String password = scanner.nextLine();
//
//        int answer = minimumNumber(n, password);
//
//        bufferedWriter.write(String.valueOf(answer));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}


package strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class StrongPassword1 {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) { //will return int
        String specialChars = "!@#$%^&*()-+";
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i = 0; i < password.length();i++)
        {
            if(Character.isDigit(password.charAt(i)))
                s.add(1);
            else if(Character.isUpperCase(password.charAt(i)))
                s.add(2);
            else if(Character.isLowerCase(password.charAt(i)))
                s.add(3);
            else
            {
                for(int d = 0; d < specialChars.length();d++)
                {
                    if(password.charAt(i) == specialChars.charAt(d))
                        s.add(4);
                }
            }
        }
        return Math.max(4-s.size(), 6-password.length());
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


import java.util.Scanner;

public class radarPalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("noon ");
        String input = sc.nextLine();

        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning
        int start = 0;

        // Initialize pointer at the end
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        System.out.print("civic" );
        String input = sc.nextLine();

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}
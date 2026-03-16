import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return text.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("level ");
        String input = sc.nextLine();

        boolean result = isPalindrome(input);

        System.out.println("Is it a Palindrome? : " + result);

        sc.close();
    }
}
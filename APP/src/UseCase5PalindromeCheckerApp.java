import java.util.Scanner;

public class UseCase4PalindromeCheckerApp{
    public static boolean isPalindrome(String input) {
        // Convert string to character array
        char[] chars = input.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = chars.length - 1;

        // Compare characters from both ends
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }
        return true; // Palindrome confirmed
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC4: Character Array Based Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call palindrome check method
        boolean result = isPalindrome(input);

        // Display result
        if (result) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}

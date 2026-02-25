public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string to be checked
        String original = "level";

        // String to store reversed value
        String reversed = "";

        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed strings
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is Not a Palindrome");
        }
    }
}
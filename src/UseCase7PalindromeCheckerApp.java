import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define input string
        String input = "refer";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Assume palindrome
        boolean isPalindrome = true;

        // Compare characters from both ends
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char back = deque.removeLast();

            if (front != back) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
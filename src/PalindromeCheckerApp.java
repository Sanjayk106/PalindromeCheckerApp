import java.util.*;

class UseCase7PalindromeCheckerApp {

    void uc7check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String wrd = "madam";

        UseCase7PalindromeCheckerApp uc7 = new UseCase7PalindromeCheckerApp();
        uc7.uc7check(wrd);
    }
}

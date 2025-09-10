public class Palindrome {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(&quot;Please provide a word to check!&quot;);
            return;
        }
        String word = args[0];  // Take word from argument
        if (isPalindrome(word)) {
            System.out.println(word + &quot; is a palindrome!&quot;);
        } else {
            System.out.println(word + &quot; is NOT a palindrome!&quot;);
        }
    }
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
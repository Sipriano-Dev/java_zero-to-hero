public class PalindromeDemo {

    public static void main(String[] args) {

        System.out.println("Is Palindrome: " + isPalindrome("wow"));

    }

    public static boolean isPalindrome(String word) {
        StringBuilder stb = new StringBuilder();
        stb.append(word);
        return stb.reverse().equals(stb);
    }

}

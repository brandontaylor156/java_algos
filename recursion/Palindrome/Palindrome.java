public class Palindrome {
    public static void main(String[] args){
        Palindrome main = new Palindrome();
        boolean result = main.isPalindrome("tacocat");
        System.out.println(result);
    }

    public boolean isPalindrome(String word){
        if (word.length() == 1 || word.length() == 0)
            return true;
        if (word.charAt(0) == word.charAt(word.length()-1))
            return isPalindrome(word.substring(1, word.length()-1));
        return false;
    }
}

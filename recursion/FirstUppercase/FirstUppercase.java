public class FirstUppercase {
    public static void main(String[] args){
        FirstUppercase main = new FirstUppercase();
        char result = main.firstUppercase("this is a string");
        System.out.println(result);
    }

    public char firstUppercase(String word){
        if (word.length() == 0)
            return ' ';
        if (Character.isUpperCase(word.charAt(0)))
            return word.charAt(0);
        else
            return firstUppercase(word.substring(1, word.length()));
        
    }
}

public class CapitalizeWord {
    public static void main(String[] args){
        CapitalizeWord main = new CapitalizeWord();
        String result = main.capitalizeWord("i love java");
        System.out.println(result);
    }

    public String capitalizeWord(String words){
        if (words.isEmpty())
            return words;

        // Initialize a char to last character of current substring
        char chr = words.charAt(words.length()-1);

        // IF ONE CHARACTER LEFT OF STRING, CAPITALIZE IT AND RETURN RETURN RETURN
        if (words.length() == 1)
            return Character.toString(Character.toUpperCase(chr));
        
        // IF SPACE PRECEDING CHARACTER, CAPITALIZE CHARACTER
        if (words.substring(words.length()-2, words.length()-1).equals(" "))
            chr = Character.toUpperCase(chr);

        // Make recursive call with substring and concatenate edited character to end
        return capitalizeWord(words.substring(0, words.length()-1))+Character.toString(chr);
    }
}

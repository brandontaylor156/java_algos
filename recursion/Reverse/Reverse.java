public class Reverse {
    public static void main(String[] args){
        Reverse main = new Reverse();
        String result = main.reverse("Brandon Taylor");
        System.out.println(result);
    }

    public String reverse(String word){
        if (word.isEmpty())
            return word;
        return word.charAt(word.length()-1) + reverse(word.substring(0, word.length()-1));
    }
}

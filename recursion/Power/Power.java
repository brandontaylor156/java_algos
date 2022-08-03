public class Power {
    public static void main(String[] args){
        Power main = new Power();
        int result = main.getPower(2, 0);
        System.out.println(result);
    }

    public int getPower(int base, int exponent){
        // Unintentional case
        if (exponent < 0)
            return -1;
            
        if (exponent == 0)
            return 1;
        return base * getPower(base, exponent-1);
    }
}

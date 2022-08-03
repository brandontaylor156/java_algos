public class GCD {
    public static void main(String[] args){
        GCD main = new GCD();
        int result = main.getGCD(108, 36);
        System.out.println(result);
    }

    public int getGCD(int a, int b){
        // Euclidian Algorithm for GCD
        if (b == 0)
            return a;
        return getGCD(b, a % b);
    }
}

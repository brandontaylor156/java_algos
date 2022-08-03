public class Factorial {
    public static void main(String[] args){
        Factorial main = new Factorial();
        int result = main.getFactorial(12);
        System.out.println(result);
    }

    public int getFactorial(int num){
        if (num < 0)
            return -1;

        if (num == 1 || num == 0)
            return 1;
        return num * getFactorial(num-1);
    }
}

public class Fib {
    public static void main(String[] args){
        Fib main = new Fib();
        int result = main.fib(10);
        System.out.println(result);
    }

    public int fib(int num){
        if (num == 1 || num == 0)
            return num;
        return fib(num-1) + fib(num-2);
    }
}

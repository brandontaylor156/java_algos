public class SumOfDigits{
    public static void main(String[] args){
        SumOfDigits main = new SumOfDigits();
        int result = main.getSum(500102);
        System.out.println(result);
    }

    public int getSum(int num){
        if (num/10 == 0)
            return num;
        return num % 10 + getSum(num/10);
    }
}
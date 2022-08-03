public class DecimalToBinary {
    public static void main(String[] args){
        DecimalToBinary main = new DecimalToBinary();
        int result = main.decimalToBinary(13);
        System.out.println(result);
    }

    public int decimalToBinary(int num){
        if (num == 0)
            return num;
        
        return num % 2 + 10 * decimalToBinary(num/2);
    }
}

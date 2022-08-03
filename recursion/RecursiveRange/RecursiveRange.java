public class RecursiveRange {
    public static void main(String[] args){
        RecursiveRange main = new RecursiveRange();
        int result = main.getRecursiveRange(20);
        System.out.println(result);
    }
    
    public int getRecursiveRange(int num){
        if (num == 0 || num ==1)
            return num;
        return num + getRecursiveRange(num-1);
    }
}

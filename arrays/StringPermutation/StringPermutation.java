public class StringPermutation {
    public static void main(String[] args){
        StringPermutation main = new StringPermutation();

        String[] array1 = {"Hello", "hey", "hi", "hola", "bye"};
        String[] array2 = {"hi", "hey", "Hello", "bye", "hola"};
        System.out.println(main.stringPermutation(array1, array2));
    }

    // Establish loops and if statement first, then add in the flag
    public boolean stringPermutation(String[] arr1, String[] arr2){
        // check lengths are same
        if (arr1.length != arr2.length)
            return false;

        // FLAG FOR EACH ITERATION AFTER FIRST 
        boolean goodSoFar = false;
        for (int i = 0; i < arr1.length; i++){
            // IF GOODSOFAR FALSE AFTER FIRST ITERATION, RETURN FALSE
            if (i != 0 && goodSoFar == false)
                return false;
            // ELSE RESET GOODSOFAR TO FALSE, CONTINUE LOOP UNTIL END
            else{
                goodSoFar = false;
                for (int j = 0; j < arr2.length; j++){
                    if (arr1[i] == arr2[j]){
                    goodSoFar = true;
                    }
                }
            }
        }
        // RETURN TRUE IF END OF LOOP REACHED
        return true;
    }
}

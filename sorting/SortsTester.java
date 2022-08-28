public class SortsTester{
    public static void main(String[] args) {
        int[] arr = {10,4,5,7,8,2,3,11,5,7};

        SortTypes mySort = new SortTypes();

        //mySort.bubbleSort(arr);
        //mySort.selectionSort(arr);
        mySort.insertionSort(arr);
        mySort.printSorted(arr);
    }
}
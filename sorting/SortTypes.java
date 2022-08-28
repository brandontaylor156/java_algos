public class SortTypes{

    // O(N^2), BUBBLING MAX TO END, both loops start at 0 (bubblezzz), number of loops will always equal arr.length-1 (no last iteration needed because will already be sorted). J goes until one less index each iteration
    // Pros: Good for when input almost sorted, when space is concern (0(1) space), also easy to implement
    // Cons: Poor time complexity
    void bubbleSort(int arr[]){
        for(int i=0; i < arr.length-1; i++){
            for (int j=0; j < arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // O(N^2), SELECTING MINIMUM FOR EACH ITERATION, outer loop starts at 0, minimum index set to first index of a particular loop (index = i)
    // Inner loop starts at i+1, both loops go to end. Find minimum index of inner loop
    // Pros/Cons similar to bubble sort, good for saving space but poor time complexity
    void selectionSort(int arr[]){
        for(int i=0; i < arr.length; i++){
            int minimumIndex = i;
            // at end of this loop, we will have that loop's minimumIndex
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[minimumIndex]){
                    minimumIndex = j;
                }
            }
            // if minimumIndex isn't first index of a particular loop, swap new minimum and first index(i)
            // value at minimumIndex gets value at i, i gets minimum value 
            if (minimumIndex != i){
                int temp = arr[i];
                arr[i] = arr[minimumIndex];
                arr[minimumIndex] = temp;
            }
        }
    }

    // O(N^2), INSERTING first element of unsorted array into correct position of sorted array (in place, no extra space required)
    void insertionSort(int arr[]){

        // loop starts at 1 because 0 index is "sorted" array of first cycle, temp is set to value of array at index i, this will be INSERTED to correct spot of sorted portion
        for(int i = 1; i < arr.length; i++){
            // j index starts at i (the greatest index of sorted portion), stops when either j reaches index 0  or value at j-1 is no longer greater than the new value we are inserting.
            int temp = arr[i], j = i;
            // value of j becomes value of j-1, j decremented, cascading effect on values until while loop fails
            while(j > 0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                j--;
            }
            // we have now reached correct index to INSERT j, assign temp to that 
            arr[j] = temp;
        }
    }

    void printSorted(int arr[]){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
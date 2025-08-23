package DSAJava;

public class Sorting{
    public static void printArray(int arr[]){
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
    }
    public static void main(String args[]){
        int[] array = {8,7,1,2,3};
        // it aint much but its a start
        // bubble sort with time complexity of O(n^2)
        for(int i = 0; i<array.length-1; i++){
            for(int j =0; j<array.length-i-1; j++){
                if(array[j]>array[j+1]){ // j =8  and j+1 = 7
                    int temp = array[j]; // temp = 8
                    array[j] = array[j+1]; // j = 7
                    array[j+1] = temp; // j+1 = 8

                }
            }
        }
        printArray(array);

        int[] selectionArray = {9,7,1,2,3};
        // selection  and time complexity of O(n^2)
        for(int i =0; i<selectionArray.length-1; i++){ // loops
            int smallest = i; // assumes first number at index[0] has the smallest element 
            for(int j = i+1; j<selectionArray.length; j++){  // loops from second number to end of array 
                if(selectionArray[smallest] > selectionArray[j]){ // compare the first element with entire array 
                    smallest = j; // selects the absolute smallest number in arr keep doing this for entire loop
                }
            }
            int temp = selectionArray[smallest];  // save the smallest element which is now [3]1 to temp
            selectionArray[smallest] = selectionArray[i]; // updated the [3]1 to now be [0]8 aka index 3 now becomes 8
            selectionArray[i] = temp; // lastly index 0 becomes smallest value in temp which is 1
        }
        printArray(selectionArray);

        int[] insertionArray = {7,8,3,1,2};

        // insertion sort
        for(int i =1; i< insertionArray.length; i++){
            int current = insertionArray[i];
            int j = i-1;
            while(j>= 0 && current < insertionArray[j]){
                insertionArray[j+1] = insertionArray[j];
                j--; 
            }
            insertionArray[j+1] = current;
        }
        printArray(insertionArray);
    }
}
// tes5=t
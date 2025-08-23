package DSAJava;

public class Sorting{
    public static void printArray(int arr[]){
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
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
    }
}
package DSAJava;

public class moreRecursionClass {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk " + n + " from " + src + " to "+ dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to "+ dest);
        towerOfHanoi(n-1, helper, src, dest);

    }
    public static void reversePrint(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        reversePrint(str, idx-1);
    }
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            
            }else{
                last = idx;
            }
        }

        findOccurance(str, idx+1, element);
    }
    public static boolean isSorted(int[] arr, int idx ){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            return isSorted(arr, idx+1);
        }else{
            return false;
        }

    }
    public static void moveAllX(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i =0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count ++;
            moveAllX(str, idx+1, count, newString);
        } else{
            newString += currChar;
            moveAllX(str, idx+1, count, newString);
        }
    }
    public static boolean[] map = new boolean[26];

    public static void removeDups(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']){
            removeDups(str, idx+1, newString);
        }else{
            newString += currChar;
            map[currChar-'a'] = true;
            removeDups(str, idx+1, newString);
        }
    }
    public static void main(String args[]){
        // // Tower of Hanoi
        // int n = 2;
        // towerOfHanoi(n, "S tower", "h tower", "D tower");
        // // O(2^n)

        // String str = "abcasdaacdd";
        // reversePrint(str, str.length()-1);

        // findOccurance(str, 0, 'a');

        // int arr[] = {1,3,5};
        // System.out.println(isSorted(arr, 0));
        String str = "abbccda";
        // moveAllX(str, 0, 0, "");
        removeDups(str, 0, "");

    }
}

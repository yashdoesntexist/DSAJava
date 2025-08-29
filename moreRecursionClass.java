package DSAJava;

import java.util.HashSet;

public class moreRecursionClass {
    // Time complexity 2^n 
    public static void towerOfHanoi(int n, String source, String helper, String destination){
        if(n==1){
            System.out.println("Transfer disk " + n + " from " + source + " to " + destination );
            return;
        }
        
        towerOfHanoi(n-1, source, destination, helper);
        System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n-1, helper, source, destination);
    }
    // O(n)
    public static void printStringReverse(String str, int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printStringReverse(str, idx-1);
    }
    // O(n)
    public static int first =-1;
    public static int last =-1;
    public static void charCounter(String str, char element, int idx){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
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

        charCounter(str, element, idx+1);
    }
    public static boolean sortedArr(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            return sortedArr(arr, idx+1);
        }else{
            return false;
        }
    }
    // O(n)
    public static void findX(int count, String str, int idx, String newStr){
        if(idx == str.length()){
            for(int i =0; i<count; i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            findX(count, str, idx+1, newStr);
        } else{
            newStr += currChar;
            findX(count, str, idx+1, newStr);
        }
    }

    public static boolean[] map = new boolean[26];
    public static void removeDuplicate(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar -'a'] == true){
            removeDuplicate(str, idx+1, newStr);
        }else{
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newStr);
        }
    }

    public static void subSeq(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        subSeq(str, idx+1, newStr+currChar);

        subSeq(str, idx+1, newStr);
    }

        public static void subSeqUnique(String str, int idx, String newStr, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newStr)){
                return;
            }else{
            System.out.println(newStr);
            set.add(newStr);
            return;

            }

        }

        char currChar = str.charAt(idx);

        subSeqUnique(str, idx+1, newStr+currChar, set);

        subSeqUnique(str, idx+1, newStr, set);
    }

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
    public static void keypadCombo(String str, int idx, String comb){
        if(idx == str.length()){
            System.out.println(comb);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i =0; i< mapping.length(); i++){
            keypadCombo(str, idx+1, comb+mapping.charAt(i));
        }
    }





    public static void main(String args[]){
        towerOfHanoi(3, "Source", "helper", "destination");
        printStringReverse("abcd", 3);
        charCounter("abaacdaefaah", 'a', 0);
        int arr[] = {6,1,2,3,4,5};
        System.out.println(sortedArr(arr, 0));
        findX(0, "axbsxaxx", 0, "");
        removeDuplicate("aabbccddeeff", 0, "");
        subSeq("abc", 0, "");
        HashSet<String> set = new HashSet<>();
        subSeqUnique("aaa", 0, "", set);
        keypadCombo("23", 0, "");


    }
}

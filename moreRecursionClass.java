package DSAJava;

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


    public static void main(String args[]){
        // towerOfHanoi(3, "Source", "helper", "destination");
        // printStringReverse("abcd", 3);
        charCounter("abaacdaefaah", 'a', 0);
    }
}

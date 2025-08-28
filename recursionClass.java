package DSAJava;

public class recursionClass {
    // Starting again cause I wasnt robust/solid about recursion
    public static void printNum(int i){
        if(i==0){
            return;
        }
        System.out.println(i);
        printNum(i-1);
        
    }
    public static void printNumAsc(int i){
        if(i==6){
            return;
        }
        System.out.println(i);
        printNumAsc(i+1);
        
    }

    public static void printNatural(int i, int n, int sum){
        if(n==i){
            System.out.println(sum+i);
            return;
        }
        sum += i;
        printNatural(i+1, n, sum);
        
    }
    public static int printFac(int n){
        if(n==1 || n==0){
            return 1;
        }

        int facprevnum = printFac(n-1);
        int factnum = n* facprevnum;
        return factnum;
    }

    public static void fibonacci(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a +b;
        System.out.println(c);
        fibonacci(b, c, n-1);
    }
    public static void main(String args[]){
        // printNum(5);
        // printNumAsc(1);   
        // printNatural(1, 5, 0);       
        // System.out.println(printFac(5));
        int n = 7;
        fibonacci(0, 1, n-2);                       
    }
}

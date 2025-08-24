package DSAJava;

public class recursionClass {
    public static void printNum(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNum(n+1);

    }
    public static void printSum(int i, int n, int sum){
        if(i == n){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
    }
    public static int printFac(int n){
        if(n == 1 || n==0){
            return 1;
        }
        int factOfnm1 = printFac(n-1);
        int fact_n = n* factOfnm1;
        return fact_n;
    }
    public static void printFib(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b, c, n-1);

    }
    public static int calcPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpown = calcPower(x, n-1);
        int xpower = x * xpown;
        return xpower;
    }

    public static void main(String args[]){
        int n =9;
        int x = 2;
        printSum(1,5,0);
        System.out.println(printFac(n));
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        printFib(a, b, n-2);
        System.out.println(calcPower(x, n));
    }
}

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

    public static void main(String args[]){
        printNum(5);
        printNumAsc(1);                                       
    }
}

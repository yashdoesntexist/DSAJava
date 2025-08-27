package DSAJava;

import java.util.Scanner;
// 1.	Enter 3 numbers from the user & make a function to print their average.
public class practiceClass {
    public static void avgCalc(int[] arr){
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Your average is " + sum/arr.length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers to calculate the average");
        int[] nums = { sc.nextInt(), sc.nextInt(), sc.nextInt()};
        sc.close();
        avgCalc(nums);
    }
}

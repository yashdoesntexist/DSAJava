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
        
    // 2.	Write a function to print the sum of all odd numbers from 1 to n.
    public static void sumOfOddNum(int n){
        int sum = 0;
        if(n <= 0){
            System.out.println("Enter an ending number greater than 1");
        }else{
            for(int i =0; i<=n; i++){
                if(i%2 != 0){
                    sum += i;
                }
            }
        }
        System.out.println("Sum of all odd numbers is " + sum);
    }

    public static void recurrence(int n){
        if(n == 0){
            System.out.println("0");
            return;
        }
        System.out.println(n);
        recurrence(n-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter 3 numbers to calculate the average");
        // int[] nums = { sc.nextInt(), sc.nextInt(), sc.nextInt()};
        // sc.close();
        // avgCalc(nums);
        System.out.println("Please enter a number n to calculate sum of all odd num from 1 to n");
        int n = sc.nextInt();
        sumOfOddNum(n);
        sc.close();
        recurrence(9);
    }
}

package DSAJava;

import java.util.ArrayList;
//testing intellij
public class advanceRecursionClass {
    public static void printPerm(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            printPerm(newString, permutation+currChar);
        }
    }

    public static int countPaths(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i ==n-1 && j == m-1){
            return 1;
        }

        // moving down 
        int downPaths = countPaths(i+1, j, n, m);
        // move right 
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths + rightPaths;
    }

    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        int verticalPlacement = placeTiles(n-m, m);
        int horizontalPlacement = placeTiles(n-1, m);

        return verticalPlacement+horizontalPlacement;
    }

    public static int invitePeople(int n){
        if(n<=1){
            return 1;
        }
        int singleInvite = invitePeople(n-1);
        int pairInvite = (n-1) * invitePeople(n-2);
        return singleInvite + pairInvite;
    }
    
    public static void printSubset(ArrayList<Integer> subset){
        for(int i =0; i<subset.size(); i++){
            System.out.print(subset.get(i)+ " ");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset){
        if(n == 0){
            System.out.println(subset);
            return;
        }
        subset.add(n);
        findSubset(n-1, subset);

        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    }


    public static void main(String[] args) {
        printPerm("abc", "");
        System.out.println(countPaths(0, 0, 3, 3));
        System.out.println(placeTiles(4, 2));
        System.out.println(invitePeople(4));
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(4, subset);

        
    }
}

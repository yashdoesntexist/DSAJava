package DSAJava;

import java.util.ArrayList;
import java.util.List;

public class backtrackingClass {
    public static void printPermutation(String str, String perm, int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, perm+ currChar, idx+1);
        }
    }

    public static boolean isSafe(int row, int col, char[][] board){
        // check row
        for(int j = 0; j < board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        // check column
        for(int i = 0; i < board[0].length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // check upper-left diagonal
        int r = row;
        for(int c = col; c >= 0 && r >= 0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // check upper-right diagonal
        r = row;
        for(int c = col; c < board.length && r >= 0; c++, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // check bottom-left diagonal
        r = row;
        for(int c = col; c >= 0 && r < board.length; c--, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // check bottom-right diagonal
        r = row;
        for(int c = col; c < board.length && r < board.length; c++, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoard){
        List<String> newBoard = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            String row = "";
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'Q'){
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoard.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoard, int col){
        if(col == board.length){
            saveBoard(board, allBoard);
            return;
        }
        for(int row = 0; row < board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allBoard, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueen(int n){
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];
        
        // initialize board with '.'
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        helper(board, allBoard, 0);
        return allBoard;
    }

    public static void main(String[] args){
    backtrackingClass nq = new backtrackingClass();
    List<List<String>> solutions = nq.solveNQueen(4);
    for(List<String> sol : solutions){
        for(String row : sol){
            System.out.println(row);
        }
        System.out.println();
    }
}
}
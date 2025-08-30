package DSAJava;

public class backtrackingClass {
    public static void permutationString(int idx, String str, String perm){
        if(str.length()==0){
            return;
        }
        for(int i=0;i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutationString(idx+1, str,  perm + currChar);
        }
        

// gotta come back to backtracking I am  lost 
    }

    public static void main(String[] args) {
        
    }
}

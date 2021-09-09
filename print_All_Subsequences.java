import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static void printAllSubsequences(String ques, String ans){
        if(ques.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        char currChar = ques.charAt(0);
        String restString = ques.substring(1);
        printAllSubsequences(restString, ans + "");
        printAllSubsequences(restString, ans + currChar);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        printAllSubsequences(s, "");
        in.close();
    }
}
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static void printStairPaths(int n, String ans){
        if(n == 0){
            System.out.print(ans + " ");
            return;
        }else if(n < 0) return;
        printStairPaths(n-1, ans + "1");
        printStairPaths(n-2, ans + "2");
        printStairPaths(n-3, ans + "3");
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        printStairPaths(n, "");
        in.close();
    }
}
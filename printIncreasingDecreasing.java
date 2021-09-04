import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static void printIncreasingDecreasing(int n){
        if(n == 0) return;
        System.out.print(n + " ");
        printIncreasingDecreasing(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        printIncreasingDecreasing(n);
        in.close();
    }
}
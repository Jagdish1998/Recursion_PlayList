import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        System.out.print(factorial(n));
        in.close();
    }
}
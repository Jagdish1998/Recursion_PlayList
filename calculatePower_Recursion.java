import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static int calculatePower(int x, int n){
        if(n == 0) return 1;
        return x * calculatePower(x, n-1);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().trim().split(" ");
        int x = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        System.out.print(calculatePower(x, n));
        in.close();
    }
}
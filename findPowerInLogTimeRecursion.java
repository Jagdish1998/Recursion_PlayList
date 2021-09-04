import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static int findPowerInLogTimeRecursion(int x, int n){
        if(n == 0) return 1;
        if(n % 2 == 0) return findPowerInLogTimeRecursion(x*x, n/2);
        else return x * findPowerInLogTimeRecursion(x*x, n/2);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] s = in.readLine().trim().split(" ");
        int x = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        System.out.println(findPowerInLogTimeRecursion(x, n));
        in.close();
    }
}


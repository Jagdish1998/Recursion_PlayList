import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static int findMaxArrayElement(int[] arr, int index){
        if(index == arr.length - 1) return arr[arr.length - 1];
        return Math.max(arr[index], findMaxArrayElement(arr, index+1));
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
        int n = Integer.parseInt(in.readLine());
        int[] arr = new int[n];
        String[] s = in.readLine().trim().split(" ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(findMaxArrayElement(arr, 0));
        in.close();
    }
}

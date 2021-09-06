import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static int findTheLastOccuredIndex(int[] arr, int index, int num){
        if(index == arr.length){
            return -1;
        }
        int pitsa = findTheLastOccuredIndex(arr, index+1, num);
        if(pitsa != -1) return pitsa;
        else{
            if(arr[index] == num) return index;
            else return -1;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[] arr = new int[n];
        String[] s = in.readLine().trim().split(" ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        int num = Integer.parseInt(in.readLine());
        int ans = findTheLastOccuredIndex(arr, 0, num);
        System.out.println(ans);
        in.close();
    }
}
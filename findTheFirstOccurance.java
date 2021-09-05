import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static int findTheFirstOccurance(int[] arr, int index, int num){
        if(index == arr.length) return -1;
        if(arr[index] == num) return index;
        else return findTheFirstOccurance(arr, index+1, num);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
        int n = Integer.parseInt(in.readLine());
        int[] arr = new int[n];
        String[] s = in.readLine().trim().split(" ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        int 
        System.out.println(findTheFirstOccurance(arr, 0, 5));
        in.close();
    }
}

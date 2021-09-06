import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static int[] findAllIndexes(int[] arr, int index, int num, int fsf){
        if(index == arr.length){
            int[] iarr = new int[fsf];
            return iarr;
        }
        if(arr[index] == num){
            int[] iarr = findAllIndexes(arr, index + 1, num, fsf + 1);
            iarr[fsf] = index;
            return iarr;
        }else{
            int[] iarr = findAllIndexes(arr, index + 1, num, fsf);
            return iarr;
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
        int[] iarr = findAllIndexes(arr, 0, num, 0);
        if(iarr.length == 0){
            System.out.println("-1");
            return;
        }
        for(int i : iarr){
            System.out.print(i + " ");
        }
        in.close();
    }
}
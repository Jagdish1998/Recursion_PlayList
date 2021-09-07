import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static ArrayList<String> getStairPaths(int n){
        if(n == 0){
            ArrayList<String> bcase = new ArrayList<>();
            bcase.add("");
            return bcase;
        }else if(n < 0){
            ArrayList<String> bcase = new ArrayList<>();
            return bcase;
        }
        
        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);
        ArrayList<String> currPath = new ArrayList<>();
        for(String p1 : path1){
            currPath.add(1 + p1);
        }
        for(String p2 : path2){
            currPath.add(2 + p2);
        }
        for(String p3 : path3){
            currPath.add(3 + p3);
        }
        return currPath;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        ArrayList<String> list = getStairPaths(n);
        for(String s : list){
            System.out.print(s + " ");
        }
        in.close();
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static ArrayList<String> getMazePaths(int currRow, int currCol, int endRow, int endCol){
        if(currRow == endRow && currCol == endCol){
            ArrayList<String> bcase = new ArrayList<>();
            bcase.add("");
            return bcase;
        }
        ArrayList<String> hPaths = new ArrayList<>();
        ArrayList<String> vPaths = new ArrayList<>();
        if(currRow < endRow){
            vPaths = getMazePaths(currRow + 1, currCol, endRow, endCol);
        }
        if(currCol < endRow){
            hPaths = getMazePaths(currRow, currCol + 1, endRow, endCol);
        }
        ArrayList<String> currPath = new ArrayList<>();
        for(String str : vPaths){
            currPath.add("V" + str);
        }
        for(String str : hPaths){
            currPath.add("H" + str);
        }
        return currPath;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
        String[] s = in.readLine().trim().split(" ");
        int endRow = Integer.parseInt(s[0]);
        int endCol = Integer.parseInt(s[1]);
        ArrayList<String> list = getMazePaths(1, 1, endRow, endCol);
        for(String str : list){
            System.out.print(str + " ");
        }
        in.close();
    }
}
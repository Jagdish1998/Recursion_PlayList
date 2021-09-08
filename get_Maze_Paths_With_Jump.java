import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static ArrayList<String> getMazePathsWithJump(int currRow, int currCol, int endRow, int endCol){
        if(currRow == endRow && currCol == endCol){
            ArrayList<String> bcase = new ArrayList<>();
            bcase.add("");
            return bcase;
        }
        ArrayList<String> currPath = new ArrayList<>();
        for(int ms = 1; ms <= endRow - currRow; ms++){
            ArrayList<String> vPaths = getMazePathsWithJump(currRow + ms, currCol, endRow, endCol);
            for(String str : vPaths){
                currPath.add("V" + ms + str);
            }
        }
        
        for(int ms = 1; ms <= endCol - currCol; ms++){
            ArrayList<String> hPaths = getMazePathsWithJump(currRow, currCol + ms, endRow, endCol);
            for(String str : hPaths){
                currPath.add("H" + ms + str);
            }
        }
        
        for(int ms = 1; ms <= endCol - currCol && ms <= endRow - currRow; ms++){
            ArrayList<String> dPaths = getMazePathsWithJump(currRow + ms, currCol + ms, endRow, endCol);
            for(String str : dPaths){
                currPath.add("D" + ms + str);
            }
        }
        
        return currPath;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
        String[] s = in.readLine().trim().split(" ");
        int endRow = Integer.parseInt(s[0]);
        int endCol = Integer.parseInt(s[1]);
        ArrayList<String> list = getMazePathsWithJump(1, 1, endRow, endCol);
        for(String str : list){
            System.out.print(str + " ");
        }
        in.close();
    }
}
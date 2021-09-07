import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    private static ArrayList<String> findTheKeypadCombinations(String s){
        if(s.length() == 0){
            ArrayList<String> bcase = new ArrayList<>();
            bcase.add("");
            return bcase;
        }
        int currChar = s.charAt(0) - '0';
        String restString = s.substring(1);
        ArrayList<String> preCase = findTheKeypadCombinations(restString);
        ArrayList<String> currCase = new ArrayList<>();
        String currString = codes[currChar];
        for(char c : currString.toCharArray()){
            for(String sng : preCase){
                currCase.add(c + sng);
            }
        }
        return currCase;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        ArrayList<String> list = findTheKeypadCombinations(s);
        for(String str : list){
            System.out.print(str + " ");
        }
        in.close();
    }
}
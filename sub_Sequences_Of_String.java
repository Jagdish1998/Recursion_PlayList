import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    private static ArrayList<String> subSequencesOfString(String s){
        if(s.length() == 0){
            ArrayList<String> bcase = new ArrayList<>();
            bcase.add("");
            return bcase;
        }
        char c = s.charAt(0);
        String sub = s.substring(1);
        ArrayList<String> plist = subSequencesOfString(sub);
        ArrayList<String> mlist = new ArrayList<>();
        for(String str : plist){
            mlist.add("" + str);
            mlist.add(c + str);
        }
        return mlist;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        ArrayList<String> list = subSequencesOfString(s);
        System.out.println(list);
        in.close();
    }
}
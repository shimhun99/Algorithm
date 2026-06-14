import java.util.*;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        // int min_len = Math.min(word1.length(), word2.length());

        // String result = "";

        // for(int i=0; i<min_len; i++){
        //     result+=word1.charAt(i);
        //     result+=word2.charAt(i);
        // }

        // if(word1.length() > word2.length()){
        //     result+=word1.substring(word2.length(), word1.length());
        // }else{
        //     result+=word2.substring(word1.length(), word2.length());
        // }
        // // System.out.println(result);

        // return result;

        int max_len = Math.max(word1.length(), word2.length());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<max_len; i++){
            if(i<word1.length()) sb.append(word1.charAt(i));
            if(i<word2.length()) sb.append(word2.charAt(i));
        }

        return sb.toString();
    }
}
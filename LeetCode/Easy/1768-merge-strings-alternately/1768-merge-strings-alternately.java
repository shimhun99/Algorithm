import java.util.*;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int min_len = Math.min(word1.length(), word2.length());

        String result = "";

        for(int i=0; i<min_len; i++){
            result+=word1.charAt(i);
            result+=word2.charAt(i);
        }

        if(word1.length() > word2.length()){
            result+=word1.substring(word2.length(), word1.length());
        }else{
            result+=word2.substring(word1.length(), word2.length());
        }
        // System.out.println(result);

        return result;
    }
}
import java.util.*;
class Solution {
    public String solution(String myString, String pat) {
        
        int max =0; 
        
        for(int i=1; i<=myString.length();i++){
            String sub = myString.substring(0,i);
            if(sub.endsWith(pat))    max =i;
        }        
        
        return myString.substring(0,max);
    }
}
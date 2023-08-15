import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        
        StringBuilder ans = new StringBuilder();
        c-=1;
        for(int i=c; i<my_string.length();i+=m){
            ans.append(my_string.charAt(i));
        } 
    
        return ans.toString();
    }
}
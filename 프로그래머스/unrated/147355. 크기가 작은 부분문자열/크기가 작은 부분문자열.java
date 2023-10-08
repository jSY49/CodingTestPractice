import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int subLen = p.length();
        
        for(int i =0 ; i <t.length()-subLen+1;i++){
            long tmp = Long.parseLong(t.substring(i,i+subLen));
            if(tmp<=Long.parseLong(p))
                answer++;
        }
        
        return answer;
    }
}
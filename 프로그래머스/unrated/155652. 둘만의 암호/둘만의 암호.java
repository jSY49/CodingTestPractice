import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        int[] alpha = new int[26];
        Arrays.fill(alpha,1);
        for(char ch : skip.toCharArray()){
            alpha[ch-'a'] = 0;
        }
        
        StringBuilder answer = new StringBuilder();
       for(char ch : s.toCharArray()){
           int res = 0;
           int tmp = ch-'a';
           while(res<index){
               tmp++;
               if(tmp>25) tmp=0;
               res+=alpha[tmp];               
           }
           
           answer.append((char)(tmp+'a'));
       }
        return answer.toString();
    }
}
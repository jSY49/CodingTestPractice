import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        for(int k =0 ; k<=citations.length; k++){
            
           int count = 0;
           for (int n : citations) {
               if (n >= k) count++;
            }
            
           if(count >= k ){
               answer = k;
           } else {
               break;
           }
        }
        return answer;
    }
}
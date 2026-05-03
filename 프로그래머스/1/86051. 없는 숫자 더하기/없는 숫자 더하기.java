import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        
        for(int k = 0 ; k<= 9 ;k++){
            
            int currentK = k;
            if(Arrays.stream(numbers).noneMatch( n -> n == currentK)){        
                answer += currentK;
            }
            
        }
        
        return answer;
    }
}
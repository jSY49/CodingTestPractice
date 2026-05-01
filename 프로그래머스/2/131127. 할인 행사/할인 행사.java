import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        
        int answer = 0;
         Map<String,Integer> targetMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            targetMap.put(want[i], number[i]);
        }
        
        for(int i=0 ; i< discount.length;i++){
            
            Map<String, Integer> currentMap = new HashMap<>();
            for (int j = i; j < i + 10; j++) {
                
                if(j < discount.length){
                    if (targetMap.containsKey(discount[j])) {
                        currentMap.put(discount[j], currentMap.getOrDefault(discount[j], 0) + 1);
                    }    
                }
            }
            
            if(targetMap.equals(currentMap)){
                answer++;
            }
        }
        
        return answer;
    }
}
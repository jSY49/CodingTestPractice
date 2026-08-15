import java.util.*; 

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String , Integer> map = new HashMap<>();
        for(String[] temp : clothes){
            map.put(temp[1],map.getOrDefault(temp[1],0)+1);
        }
        
        // 입지 않는 경우 +1 
        for(String k : map.keySet()){
             answer *= (map.get(k)+1);
        }
        
        //모두 입지 않는 경우 (하루에 최소 한 개의 의상은 입기 때문)
        return answer-1;
    }
}




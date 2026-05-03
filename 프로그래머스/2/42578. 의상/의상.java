import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        Map<String , Integer> map = new HashMap<>();
        for(int i=0; i< clothes.length;i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        }
        
        int num2 = 1;
        for(String k : map.keySet()){
            num2 *= (map.get(k) + 1);
            System.out.println(map.get(k));
        }
        answer = num2-1;
        return answer;
    }
}
import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(String str : strArr){
            int len =str.length();
            map.put(len,map.getOrDefault(len,0)+1);
        }
        
        int max=0; 
        for(int a : map.keySet()){
            max = Math.max(max,map.get(a));
        }
        
        return max;
    }
}
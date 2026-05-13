import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        ArrayList<String> cache = new ArrayList<>();
        
        for(int i =0 ; i< cities.length;i++){
            
            String city = cities[i].toLowerCase();
            
            if (cacheSize == 0) { // 캐시 사이즈가 0이면 무조건 5점씩 추가
                answer += 5;
                continue;
            }
            
            if(cache.contains(city)){
                answer+=1; 
                cache.remove(city);
                cache.add(city);
            }    
            else {
                answer+=5; 
           
                if(cache.size()>=cacheSize){
                    cache.remove(0);
                } 
                     cache.add(city);
            }
        }
        
        return answer;
    }
}


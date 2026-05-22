import java.util.*; 

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int userCount  = stages.length; 
        int[] users = new int[N+1];
        for(int a : stages){
            users[a-1] += 1; 
        }
        
        Map<Integer,Double> map = new HashMap<>();
        for(int i =0 ; i< N ; i++){
            int user = users[i];
            int total = userCount; 
            double rate = 0; 
            
            if (total != 0) {
               rate = (double)user / total; 
            }   
            
            map.put(i,rate); 
            userCount -=user; 
        }
        
        List<Map.Entry<Integer,Double>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)-> b.getValue().compareTo(a.getValue()));
        
        int idx =0 ; 
        for(Map.Entry<Integer,Double> tmp : list){
            
            answer[idx++] = (tmp.getKey())+1;
            
        }
        
        return answer;
    }
}
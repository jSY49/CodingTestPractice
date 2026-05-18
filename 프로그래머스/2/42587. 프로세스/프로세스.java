import java.util.*; 

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int size = priorities.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : priorities) {
            list.add(num);
        }
        
        while(size > 0 ){
            
            if(isFirst(list)){
                
                answer++ ; 
                
                if(location == 0 ){
                    break;  
                } else {
                    location--; 
                    list.remove(0);
                }
                
            } else {
                int temp = list.get(0);
                list.remove(0);
                list.add(temp);
                
                if(location == 0 ){
                    location = list.size()-1; 
                } else {
                    location--;
                }
            }
            
        }
        
        return answer;
    }
    
    public boolean isFirst(ArrayList<Integer> list){
        
        int temp = list.get(0);
        
        for(int i = 1; i< list.size() ; i++){
            
            if(temp< list.get(i)){
                return false; 
            }
        }
        
        return true; 
        
    }
}
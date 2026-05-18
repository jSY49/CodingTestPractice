import java.util.*; 

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Set<Integer> first = new HashSet<>();
        Map<Integer,Integer> second = new HashMap<>();
        for (int t : topping) {
            second.put(t, second.getOrDefault(t, 0) + 1);
        }
        
        
        for(int i = 0; i< topping.length; i++) {
            
            int currentTopping = topping[i];
            first.add(currentTopping);
            second.put(currentTopping, second.get(currentTopping) - 1);
            
            if (second.get(currentTopping) == 0) {
                second.remove(currentTopping);
            }
            
            if (first.size() == second.size()) {
                answer++;
            }
            
        }
        
        return answer;
    }
    
}
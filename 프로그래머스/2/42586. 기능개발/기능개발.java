import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        /*
        1. 남은 진행률확인 
        2. 며칠이 걸릴지 확인 
        3. 한번에 함께 배포할 수 있는 기능 개수 확인 
        4. 반복 
        */
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> daysQueue = new LinkedList<>();
        
        for(int i =0 ; i< speeds.length;i++){
            
            int remain = 100 - progresses[i];
            int completeDay = (int)Math.ceil((double)remain/speeds[i]);
            daysQueue.add(completeDay);
        }
        
        
        while(!daysQueue.isEmpty()){
            
            int temp = daysQueue.poll();
            int count = 1 ;
            
            while(!daysQueue.isEmpty() && daysQueue.peek() <= temp){
                daysQueue.poll();
                count++;
            }
            
            answer.add(count);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
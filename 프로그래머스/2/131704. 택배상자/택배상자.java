import java.util.*; 

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        Stack<Integer> sub = new Stack<>();
        int idx =1; 
        for (int box = 1; box <= order.length; box++) {
            sub.push(box);
            
            while (!sub.isEmpty() && sub.peek() == order[answer]) {
                sub.pop();
                answer++;  
            }
        }
        
        return answer;
    }
}

/*
 1 2 3 4 5 
 
 보조 : 1 2 
 트럭 : 4 3  
*/
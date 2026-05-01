import java.util.*;
class Solution {
    public int solution(String s) {
        
        String[] str = s.split("");
        int answer = 0;
        
        Queue<String> queue = new LinkedList<>();
        Collections.addAll(queue,str);
        
        for(int i =0 ; i< s.length();i++){
            
            if(i > 0) {
                queue.offer(queue.poll());
            }
            
           if(isValid(queue)) {
               answer++;
           }
        }

        return answer;
    }
    
    public boolean isValid(Queue<String> q){
        
        Stack<String> stack = new Stack<>();
        for (String str : q) {
            if (str.equals("(") || str.equals("[") || str.equals("{")) {
            stack.push(str);
            } else {
                if (stack.isEmpty()) return false;
                String top = stack.pop();
                if (str.equals(")") && !top.equals("(")) return false;
                if (str.equals("]") && !top.equals("[")) return false;
                if (str.equals("}") && !top.equals("{")) return false;
        }
    }
    return stack.isEmpty();
        
    }
}
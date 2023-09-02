import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];   
        int idx=0;
        for(int[] com : commands){
            int[] tmp =Arrays.copyOfRange(array,com[0]-1,com[1]);
            Arrays.sort(tmp);
            answer[idx++]=tmp[com[2]-1];
        }
        
      
        return answer;
    }
}


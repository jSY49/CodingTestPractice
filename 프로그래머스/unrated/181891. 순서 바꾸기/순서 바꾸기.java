import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        int idx=0;
        for(int a : Arrays.copyOfRange(num_list,n,num_list.length))
            answer[idx++] = a;
        for(int a : Arrays.copyOfRange(num_list,0,n))
            answer[idx++] = a;
        
        return answer;
    }
}
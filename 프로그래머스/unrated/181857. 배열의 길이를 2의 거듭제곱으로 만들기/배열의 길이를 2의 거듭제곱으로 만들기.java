import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        
        int len = arr.length;
        int pow = 0;
        
        while(len>Math.pow(2,pow)) pow++;
        
        if(len == Math.pow(2,pow)) return arr;
        
        int[] answer = new int[(int)Math.pow(2,pow)];
    
        for(int i=0; i<arr.length;i++){
            answer[i]=arr[i];
        }
        
        
        return answer;
    }
}
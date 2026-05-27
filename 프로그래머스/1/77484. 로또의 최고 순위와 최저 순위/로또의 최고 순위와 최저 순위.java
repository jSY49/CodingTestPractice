import java.util.*; 

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int temp =0 ; 
        int zero = 0 ; 
        
        int[] nums = new int[46];
        for(int n : win_nums){
            nums[n] +=1; 
        }
        
        for(int lotto : lottos){
            
            if(lotto == 0){
                zero++; 
                continue;
            }
            
            if(nums[lotto] >0){
                temp++;
            }
            
        }
        
        int min = temp; 
        int max = temp+zero; 
       
        if (max >= 2) {
            answer[0] = 6 - max + 1;
        } else {
            answer[0] = 6; // 0개나 1개 맞춘 건 무조건 6등(낙첨)
        }
        
        if(min >= 2)
            answer[1] = 6 - min + 1; 
        else 
            answer[1] = 6; 
        
        
        return answer;
    }
}


import java.util.*; 

class Solution {
    public int solution(int[] nums) {
        
         int total = nums.length/2;
        Set<Integer> set = new HashSet<>();
        for(int a : nums){
            set.add(a);
        }
        return Math.min(set.size(), total);
    }
}


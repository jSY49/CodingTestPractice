import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int n : nums)
            if(!set.contains(n)) set.add(n);
    
        return (set.size()>nums.length/2)? nums.length/2:set.size(); 
    }
}
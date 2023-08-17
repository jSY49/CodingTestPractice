class Solution {
    public int solution(int[] num_list) {
        int idx=0;
        for(int a : num_list){
            if(a<0) return idx;
            idx++;
        }
        
        return -1;
    }
}
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        
        int i=0;
        for(int a : num_list){
            answer[i++]=a;
        }
        answer[i] = (answer[i-2]<answer[i-1])? answer[i-1]-answer[i-2]:answer[i-1]*2;
               
        return answer;
    }
}
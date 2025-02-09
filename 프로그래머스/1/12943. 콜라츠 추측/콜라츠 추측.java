class Solution {
    public int solution(int num) {
        long answer = 0L;
        long transNum = num;
        
        while(answer<500 && transNum!=1){
            if(transNum%2==0)    transNum /=2;
            else    transNum = transNum*3+1;
            answer ++; 
        }
        
        // System.out.println(answer +"/"+transNum);
        return answer>=500? -1 : (int)answer;
    }
}
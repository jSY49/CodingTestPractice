class Solution {

    int answer = 0;
        
    public int solution(int[] numbers, int target) {
        
        calcuate(numbers,target,0,0);
        
        return answer;
    }
    
    public void calcuate(int[] numbers, int target , int tempSum , int idx){
        
        if (idx == numbers.length) {
            if (tempSum == target) {
                answer++;  
            }
            return;  
        }
        
        if(idx < numbers.length){
            
            int sum = tempSum+numbers[idx];
            int sum2 = tempSum-numbers[idx];
            calcuate(numbers,target,sum,idx+1);
            calcuate(numbers,target,sum2,idx+1);
        }
    }
}
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i =0 ; i< n ;i++){
            int temp = arr1[i]|arr2[i];
            
            StringBuilder sb = new StringBuilder();
            for(int k = 0 ; k<n;k++){
                if(temp%2!=0){
                    sb.append("#");
                }else {
                    sb.append(" ");
                }
                temp /=2;
            }
            answer[i] = sb.reverse().toString();
        }
        
        return answer;
    }
}
class Solution {
    public String solution(int[] food) {
        
        StringBuilder sb = new StringBuilder();
        for(int i =1 ; i<food.length ; i++){
            
            for(int k =0 ; k< food[i]/2;k++){
                sb.append(i);
            }
        }
        return sb.toString()+"0"+sb.reverse().toString();
    }
}
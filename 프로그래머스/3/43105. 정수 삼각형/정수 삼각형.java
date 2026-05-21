import java.util.*; 
class Solution {  
    
    public int solution(int[][] triangle) {
        int max =0 ;
        
        for(int i =1 ; i< triangle. length ; i++ ){
            
            for(int k =0 ; k < triangle[i].length; k++){
                
                if(k ==0){
                    triangle[i][k] += triangle[i-1][k];
                } else if( k == triangle[i].length-1){
                    triangle[i][k] += triangle[i-1][k-1];
                } else {
                    triangle[i][k] += Math.max(triangle[i-1][k],triangle[i-1][k-1]);
                }
            }
        }
        
        int depth = triangle.length-1;
        for(int i =0 ; i< triangle[depth].length; i++){
            max = Math.max(max, triangle[depth][i]);
        }
        
        return max;
    }
    
     
}
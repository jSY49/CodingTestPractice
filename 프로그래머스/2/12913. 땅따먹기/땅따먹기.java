class Solution {
    int solution(int[][] land) {
        int answer = 0;

         for(int i = 1 ; i< land.length; i++){  // 2행~ 
             for(int k = 0; k< land[i].length;k++){ //현재 행의 열 
                 
                 int max =0 ; 
                for(int j = 0; j< land[i-1].length;j++){    // 이전 행의 열
                    if(k!=j){
                        max = Math.max(land[i-1][j],max);
                    }
                }    
                 land[i][k] = land[i][k]+max;
             }
         }
        
        for(int a : land[land.length-1]){
            answer = Math.max(answer,a);
        }

        return answer;
    }
}
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for(int i =0 ; i < n ; i++){
            if(!visited[i]){
                
                answer++; 
                dfs(i,computers,visited);
            }
        }
        
        return answer;
    }
    
    void dfs(int current , int[][] computers, boolean[] visited){
        
        visited[current] = true; 
        
       for(int k=0 ; k<computers.length ; k++){
           if (computers[current][k] == 1 && !visited[k]) {
                dfs(k, computers, visited); 
            }
       }
    }
}

/*
1 1 0
1 1 0
0 0 1 
(1-2)

visited[0] = t 
visited[1] = t
visited[2] = t

answer = 2 

*/
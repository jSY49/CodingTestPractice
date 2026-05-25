
import java.util.*; 

class Solution {
    
    class Node {
        int val;
        int count;
        Node(int val, int count) {
            this.val = val;
            this.count = count;
        }
    }
    
    public int solution(int x, int y, int n) {
        
        if (x == y) return 0;
        
        int answer = 0;
             
        answer = bfs(x,y,n);
        
        return answer;
    }
    
    public int bfs(int x, int y, int n){
        
        Queue<Node> qu = new LinkedList<>();
        boolean[] visited = new boolean[y+1];
        
        qu.offer(new Node(x, 0));
        visited[x] = true;
        
        while(!qu.isEmpty()){
            
            Node cur = qu.poll();
            
            int[] nextValue = {cur.val+n,cur.val*2,cur.val*3};
            
            for(int next : nextValue){
                if(next == y){
                    return cur.count+1; 
                }
                
                if(next<y && !visited[next]){
                    visited[next] = true; 
                    qu.offer(new Node(next,cur.count+1));
                }
            }     
            
        }
        
        return -1; 
    }
}
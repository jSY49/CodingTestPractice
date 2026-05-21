import java.util.*; 

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        Set<String> set = new HashSet<>();
         
        int x = 0 ; 
        int y= 0 ; 
        
        for(int i =0 ; i< dirs.length() ; i++){
            
            int nx = x; 
            int ny = y; 
            
            char tmp = dirs.charAt(i);
            
            if(tmp=='L'){
                if(x>-5) nx--; 
            }else if(tmp=='R'){
                if(x<5) nx++; 
            }else if(tmp=='U'){
                if(y<5) ny++; 
            }else if(tmp=='D'){
                if(y>-5) ny--;
            }
            
            if(nx!=x || ny != y){
                set.add(x + "," + y + "->" + nx + "," + ny);
                set.add(nx + "," + ny + "->" + x + "," + y);
                x= nx;
                y= ny;
            }
            
        }
        
        return set.size() /2;
    }
}
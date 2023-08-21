import java.util.*;
class Solution {
    int h,w;
    public int[] solution(String[] park, String[] routes) {
        
        w= park[0].length();
        h= park.length;

        String[][] p = new String[h][w];
    
        int[] tmp = new int[2];
        
        for(int i=0; i<park.length;i++){
            for(int j=0; j<park[i].length();j++){
                if(park[i].charAt(j)=='S'){
                    tmp[0]= i;
                    tmp[1]= j;
                }
            }
            p[i]=park[i].split("");
        }
        
        for(int i=0 ; i<routes.length;i++){
            String[] route = routes[i].split(" ");
            int move = Integer.valueOf(route[1]);
            verify(p,route[0],move,tmp);
        }
        
        return tmp;
    }
    private void verify(String[][] p,String dir , int m,int[] tmp){
   
        switch(dir){
            case "E":
                if(tmp[1]+m>=w) return;
                for(int i=1;i<=m;i++){
                    if(p[tmp[0]][tmp[1]+i].equals("X")) return;
                }
                tmp[1]+=m;
                break;
            case "W":
                 if(tmp[1]-m<0) return;
                for(int i=1;i<=m;i++){
                    if(p[tmp[0]][tmp[1]-i].equals("X")) return;
                }
                tmp[1]-=m;
                break;
                
            case "S":
                if(tmp[0]+m>=h) return ;
                for(int i=1;i<=m;i++){
                    if(p[tmp[0]+i][tmp[1]].equals("X")) return ;
                }
                tmp[0]+=m;
                break;
                
            case "N":
                if(tmp[0]-m<0) return;
                for(int i=1;i<=m;i++){
                    if(p[tmp[0]-i][tmp[1]].equals("X")) return ;
                }
                tmp[0]-=m;
                break;
                
        }
        
        return ;
    }
}
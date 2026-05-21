import java.util.*; 

class Solution {
    
     String[] vowels = {"A","E","I","O","U"};
    List<String> list = new ArrayList<>();
    
    public int solution(String word) {
        int answer = 0;
           
        dfs("",0);
        
        return list.indexOf(word) + 1;
    }
    
    public void dfs(String str, int length) {
        
        if(length >5) return; 
        
        if(!str.isEmpty()){
            list.add(str);
        }
        
        for (int i = 0; i < 5; i++) {
            dfs(str + vowels[i], length + 1);
        }
    }
}

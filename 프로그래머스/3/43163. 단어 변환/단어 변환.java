import java.util.*; 

class Solution {
    
    int answer = Integer.MAX_VALUE;
    
    public int solution(String begin, String target, String[] words) {
        
        if (!Arrays.asList(words).contains(target)) 
            return 0; 
        
        boolean[] visited = new boolean[words.length];
        
        dfs(visited, words,begin,target, 0);
        
       return answer == Integer.MAX_VALUE ? 0 : answer;
    }
    
    public void dfs(boolean[] visited, String[] words, String begin, String target, int count){
        
        if(begin.equals(target)){
            answer = Math.min(answer, count);
            return; 
        }
        
        for(int i =0 ; i< words.length; i++){
            if(!visited[i] && isOneCharDifferent(begin,words[i])){
                visited[i] = true; 
                dfs(visited, words, words[i], target, count + 1);
                visited[i] = false; 
            }      
        }
    }
    
    public boolean isOneCharDifferent(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

         int diffCount = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                diffCount++;
            }
        
            if (diffCount > 1) return false;
        }

        return diffCount == 1;
    }
}
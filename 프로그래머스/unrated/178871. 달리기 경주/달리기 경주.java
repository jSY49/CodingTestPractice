import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> playerMap = new HashMap<>();
        
        int idx=1;
        for(String p : players){
            playerMap.put(p,idx);
            idx++;
        }
        
        for(String callP : callings){
            int losePRank = playerMap.get(callP)-1;
            
            String loseP = players[losePRank-1];
            players[losePRank-1] = players[losePRank];
            players[losePRank] = loseP;
            
            playerMap.put(callP,losePRank);
            playerMap.put(loseP,losePRank+1);
            
            
        }
    
        
        return players;
    }
}
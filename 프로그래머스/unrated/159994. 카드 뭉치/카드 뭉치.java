import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        ArrayList list1 = new ArrayList(Arrays.asList(cards1));
        ArrayList list2 = new ArrayList(Arrays.asList(cards2));
        
        for(String str : goal){
            if(list1.size()>0&&list1.get(0).equals(str)) 
                list1.remove(0);
            else if(list2.size()>0&&list2.get(0).equals(str)) 
                list2.remove(0);
            else{
                answer="No";
                break;
            }
        }
        
        return answer;
    }
}
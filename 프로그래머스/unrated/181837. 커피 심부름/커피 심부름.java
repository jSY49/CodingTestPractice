class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String od: order){
            if(od.contains("americano")) answer +=4500;
            else if(od.contains("cafelatte")) answer +=5000;
            else answer +=4500;
            
        }
        return answer;
    }
}
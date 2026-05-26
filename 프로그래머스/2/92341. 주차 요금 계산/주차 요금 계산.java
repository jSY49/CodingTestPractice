import java.util.*; 
class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        Map<String,Integer> map = new TreeMap<>(); // 차번호 , 지금 시간 
        Map<String,Integer> totalMap = new TreeMap<>(); // 차 번호, 누적 시간 
        
        for(String record : records){
            
            String[] data = record.split("\\s|:");
            int time = Integer.parseInt(data[0])*60 + Integer.parseInt(data[1]);
            String carNum = data[2];
            
            
            if(data[3].equals("IN")){
                map.put(carNum,time);
                
            }else {
                
                int inTime = map.remove(carNum);  
                int duration = time - inTime;      
                totalMap.put(carNum, totalMap.getOrDefault(carNum, 0) + duration);
            }
            
        }
        
        for (String carNum : map.keySet()) {
            int inTime = map.get(carNum);
            int duration = 1439 - inTime; // 23:59 = 1439
            totalMap.put(carNum, totalMap.getOrDefault(carNum, 0) + duration);
        }   
        
       // fees[0]=기본시간, fees[1]=기본요금, fees[2]=단위시간, fees[3]=단위요금
        int[] answer = new int[totalMap.size()];
        int idx = 0;

        for (String carNum : totalMap.keySet()) {
            
           int totalTime = totalMap.get(carNum);
           int fee = fees[1]; // 기본 요금 
    
           if (totalTime > fees[0]) { 
               int extraTime = totalTime - fees[0];
               int unit = (int) Math.ceil((double) extraTime / fees[2]);
               fee += unit * fees[3];
           }
            answer[idx++] = fee;
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> res = new ArrayList<>();
        Map<String , Integer> map = new HashMap<>();
        
        for(int i=0 ; i< terms.length;i++){
            String[] tmp = terms[i].split("\\s");
            map.put(tmp[0],Integer.parseInt(tmp[1]));
        }
        
        for(int i=0 ; i< privacies.length;i++){
            System.out.printf("\n");
            String[] pri = privacies[i].split("\\s");   //계약 건 날짜,종류 분리 
            String[] date = pri[0].split("\\.");  //계약 날짜 분리 
            int endMon = map.get(pri[1]);   //해당 계약건의 약관기간
            
            int year = Integer.parseInt(date[0]);   //계약날짜의 년
            int mon = Integer.parseInt(date[1]);    //계약날짜의 월 
            int day = Integer.parseInt(date[2]);    //계약날짜의 일  

            //동의일+유료기간
            if(mon+endMon>12){
                mon +=endMon;
                while(mon>12){  //약관 개월수가 1~100
                    year+=1;
                    mon=mon-12;    
                }
            }else{
                mon=mon+endMon;
            }
            
            if(day-1 <1){
                mon-=1;
                day =28;
            }else {
                day-=1;
            }
            
            //오늘날짜 vs 폐기일
            String[] todayDate =today.split("\\.");
            
            if(Integer.parseInt(todayDate[0])>year) {
                res.add(i+1); 
                continue;
            }else if(Integer.parseInt(todayDate[0])<year) continue;
            
            if(Integer.parseInt(todayDate[1])>mon) {
                res.add(i+1); 
                continue;
            }else if(Integer.parseInt(todayDate[1])<mon) continue;
            
            if(Integer.parseInt(todayDate[2])>day) {
                res.add(i+1); 
                continue;
            }
            
        }
        
        
        int[] answer = new int[res.size()];
        for(int i=0 ;i< res.size();i++)
            answer[i]=res.get(i);
        return answer;
    }
}
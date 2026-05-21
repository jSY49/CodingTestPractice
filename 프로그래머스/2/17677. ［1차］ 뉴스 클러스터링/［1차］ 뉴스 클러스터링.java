import java.util.*; 

class Solution {
    public int solution(String str1, String str2) {
        
        int mul =65536 ; 
        
        double answer = 0;
        Map<String,Integer> arr1 = new HashMap<>();
        Map<String,Integer> arr2 = new HashMap<>();
        int E=0 , S=0;
        
        sepString(arr1,str1);
        sepString(arr2,str2);
        
        if(arr1.size()==0 && arr2.size() ==0 )
            return 1*mul; 
        
        Set<String> allKeys = new HashSet<>();
        allKeys.addAll(arr1.keySet());
        allKeys.addAll(arr2.keySet());
        
        for(String key : allKeys){
            int count1 = arr1.getOrDefault(key, 0);
            int count2 = arr2.getOrDefault(key, 0);
            
            E += Math.min(count1, count2);  
            S += Math.max(count1, count2);  
        }
        
        answer = (double) E/S;
        
        return (int)(answer*mul);
    }
    
    void sepString(Map<String,Integer> map , String str){
        
        for(int i =0 ; i < str.length()-1 ; i++){
            
            String temp = str.substring(i,i+2).toLowerCase();
            if(temp.matches("^[a-zA-Z]+$")){
                map.put(temp, map.getOrDefault(temp,0)+1);
            }
        }
    }
}

/*
1. 리스트 저장해 (2글자씩+ 소문자로만 )
2. 영문자 빼고 포함된 글자 있으면 해당 원소 삭제 
3. 공집합 이면 1 reuturn 
4. 교집합 합집합 찾아서 
    교집합 : 같은 키가 있으면 min 값 만큼 가져 , 아니면 0 
    합집합 : 같은 키가 있으면 max 값 만큼 가져, 아니면 2추가(각각)
5. 계산 해서 *65536 (소수점 버려) 
*/
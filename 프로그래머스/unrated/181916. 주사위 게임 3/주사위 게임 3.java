import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer , Integer> map = new HashMap<>();
        map.put(a,map.getOrDefault(a,0)+1);
        map.put(b,map.getOrDefault(b,0)+1);
        map.put(c,map.getOrDefault(c,0)+1);
        map.put(d,map.getOrDefault(d,0)+1);
        
        List<Integer> keys = new ArrayList<Integer>(map.keySet());
        // for(Integer v : keys) {
        //     System.out.println(v+" : "+ map.get(v) );
        // }
        
        switch(map.size()){
            case 1: answer = 1111*a; break;     //4
            case 2: 
                if(map.get(keys.get(0))==1||map.get(keys.get(1))==1){   //3:1
                    int p = map.get(keys.get(0)) == 3 ? keys.get(0) : keys.get(1);
                    int q = map.get(keys.get(0)) == 1 ? keys.get(0) : keys.get(1);
                    answer = (int)Math.pow((10 * p) + q, 2);
                }else{  //2:2
                    int p = keys.get(0);
                    int q = keys.get(1);
                    answer = (p+q)*Math.abs(p-q);
                }
                break;
            case 3: //2:1:1
                for(Integer val : map.keySet()){
                    if(map.get(val)!=2)
                        answer = answer==0? answer+val:answer*val;
                }
                break;
            case 4: //1:1:1:1
                int min = 7;
                for(Integer val : map.keySet()){
                    min = Math.min(val,min);
                }
                answer = min;
                break;
        }
        
        return answer;
    }
}

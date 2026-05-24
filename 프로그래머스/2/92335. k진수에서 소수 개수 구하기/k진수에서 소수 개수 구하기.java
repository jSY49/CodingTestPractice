import java.util.*; 
class Solution {
    
    boolean[] dp; 
    
    public int solution(int n, int k) {
        int answer = 0;
        
        String trans = Integer.toString(n, k);
        String[] sep = trans.split("0");
        
        for (String s : sep) {
            if (s.equals("")) continue; //연속된 0 
          
            long num = Long.parseLong(s);
           
            if (isPrime(num)) {
                answer++;
            }
        }
        
        return answer;
    }
    
   public boolean isPrime(long num) {
        if (num < 2) return false;  
        
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;  
            }
        }
        return true;  
   }
}
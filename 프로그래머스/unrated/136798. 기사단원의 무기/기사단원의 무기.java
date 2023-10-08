class Solution {
    public int solution(int number, int limit, int power) {
        int total=0;
        
        for(int i=1; i<= number;i++){
            int cnt =countDivisors(i);
            cnt = cnt > limit? power:cnt;
            total+=cnt;
        }        
        return total;
    }

    static int countDivisors(int n){
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                if (n / i == i)
                    cnt++;
                else 
                    cnt = cnt + 2;
            }
        }
        return cnt;
    }

    
}
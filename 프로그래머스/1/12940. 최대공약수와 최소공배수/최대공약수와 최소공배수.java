class Solution {
    public int[] solution(int n, int m) {
        
        int gcdResult = n<m? gcd(n,m) : gcd(m,n);
        int lcmResult = n<m? lcm(n,m) : lcm(m,n);
        int[] answer = new int[]{gcdResult, lcmResult};
        return answer;
    }
    
    public int gcd( int a , int b){
        if(b == 0) return a; 
        return gcd(b,a%b);
    }
    
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
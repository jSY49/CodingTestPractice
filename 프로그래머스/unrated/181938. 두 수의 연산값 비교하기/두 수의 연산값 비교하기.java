class Solution {
    public int solution(int a, int b) {
        
        int num1 = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        int num2 = 2*a*b;
        
        return num1>=num2? num1:num2;
    }
}
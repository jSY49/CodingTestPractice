class Solution {
    public int solution(int a, int b, int n) {
        int sum = 0;
        int temp = n;
        
        while(temp/a !=0){
            
            sum += (temp/a)*b;
            temp = (temp/a)*b + temp%a;
            
            System.out.println(sum+","+temp);
        }
        return sum;
    }
}
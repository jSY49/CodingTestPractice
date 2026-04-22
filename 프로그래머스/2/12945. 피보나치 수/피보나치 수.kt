class Solution {
    fun solution(n: Int): Int {
        
        val m = 1234567L
        var first = 0L
        var second = 1L 
        var result = 0L
        
        for(i in 2 .. n){
            
            result = (first + second)%m
            first = second%m
            second = result%m
        }
        return (result).toInt()
    }
}
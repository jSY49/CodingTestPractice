class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0L
        
        val min = Math.min(a,b)
        val max = Math.max(a,b)
        
        for(i in min .. max){
            answer +=i.toLong()
        }
        
        return answer
    }
}
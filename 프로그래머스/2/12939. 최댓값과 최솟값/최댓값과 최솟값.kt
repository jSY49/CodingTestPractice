class Solution {
    fun solution(s: String): String {
        
        
        val arr = s.split(" ").map{it.toInt()}
        var answer = "${arr.minOrNull()} ${arr.maxOrNull()}"
        return answer
    }
}
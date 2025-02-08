import kotlin.math.*

class Solution {
    fun solution(n: Long): Long {
        val sqrtNum = sqrt(n.toDouble())    //제곱근 계산 
        val intSqrt = sqrtNum.toLong()      //제곱근 to Long 

        if (intSqrt * intSqrt == n) {
            return (intSqrt + 1) * (intSqrt + 1) // 다음 제곱수 계산
        } else {
            return -1
        }
    }
}
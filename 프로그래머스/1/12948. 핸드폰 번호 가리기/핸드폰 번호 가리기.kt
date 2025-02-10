class Solution {
    fun solution(phone_number: String): String {
        var answer = StringBuilder()
 
        val array = Array(phone_number.length) {phone_number[it].toString()}
        val size = array.size
        
        for(i in array.indices){
            if(size - i >4){
                answer.append("*")
            }else{
                answer.append(array[i])
            }
        }
        
        return answer.toString()
    }
}
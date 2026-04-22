class Solution {
    fun solution(s: String): String {
        
        val words = s.split(" ")
        
       val result = words.map { word ->
        word.mapIndexed { index, char ->
            if (index % 2 == 0) char.uppercaseChar() else char.lowercaseChar()
        }.joinToString("")
    }
    return result.joinToString(" ")
    }
}